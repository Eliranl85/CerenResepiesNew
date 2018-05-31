package il.co.beeart.cerenresepies;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainMenu extends Activity {

    private List<RecipesTopics> topics;
    private ListView lstTopics;
    String[] topicsNames = {"Deserts", "Bakery", "Main Courses", "Breakfasts", "Salads", "soups"};
    private Button btnAddTopic;
    RecipesListAdapter listAdapter;

    public MainMenu() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_layout);
        lstTopics = findViewById(R.id.lstTopics);
        btnAddTopic = findViewById(R.id.btnAddTopic);
        listAdapter = new RecipesListAdapter(this, topics);
        lstTopics.setAdapter(listAdapter);



        if (lstTopics==null) {
            for (int i = 0; i <= 5; ) {
                topics.add(new RecipesTopics(topicsNames[i]));
            }
        }else {

            btnAddTopic.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = getFragmentManager();
                    NewTopicDialog topicDialog =
                            new NewTopicDialog();
                    topicDialog.setCancelable(true);
                    //  topicDialog.setListener(this);
                    topicDialog.show(fragmentManager, "1");
                }
            });
        }
        lstTopics.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }

        });
    }
}
