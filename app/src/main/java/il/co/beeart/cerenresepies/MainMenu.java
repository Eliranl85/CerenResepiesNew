package il.co.beeart.cerenresepies;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends Activity {


    RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    //String[] topicsNames = {"Deserts", "Bakery", "Main Courses", "Breakfasts", "Salads", "soups"};
    List<RecipesTopics> listData = new ArrayList();

    private Button btnAddTopic;

    public MainMenu() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_layout);



        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        final RecyclerView.Adapter adapter = new RecyclerAdapter(listData, this);
        recyclerView.setAdapter(adapter);

        listData.add(new RecipesTopics("2"));

            /*btnAddTopic.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = getFragmentManager();
                    NewTopicDialog topicDialog =
                            new NewTopicDialog();
                    topicDialog.setCancelable(true);
                    //  topicDialog.setListener(this);
                    topicDialog.show(fragmentManager, "1");
                }
            });*/

        /*lstTopics.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }

        });*/
    }
}
