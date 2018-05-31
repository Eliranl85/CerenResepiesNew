package il.co.beeart.cerenresepies;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import il.co.beeart.cerenresepies.R;
import il.co.beeart.cerenresepies.RecipesTopics;

public class RecipesListAdapter extends ArrayAdapter<List<RecipesTopics>>{

    private Activity activity;
    private List<RecipesTopics> recipesTopics;

    public RecipesListAdapter(Activity activity, List<RecipesTopics> recipesTopics) {
        super(activity, R.layout.topic_row, Collections.singletonList(recipesTopics));
        this.activity = activity;
        this.recipesTopics = recipesTopics;
    }

    static class ViewContainer{
        TextView lblTopicName;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewContainer viewContainer;
        View rowTopic = convertView;
        if(rowTopic == null){
            LayoutInflater inflater = activity.getLayoutInflater();
            rowTopic = inflater.inflate(R.layout.topic_row, null);
            viewContainer = new ViewContainer();
            viewContainer.lblTopicName = rowTopic.findViewById(R.id.lblTopicName);
            rowTopic.setTag(viewContainer);

        }else{
            viewContainer = (ViewContainer) rowTopic.getTag();
        }

       /*RecipesTopics topic = recipesTopics.get(position);
        viewContainer.lblTopicName.setText(recipesTopics.getName());*/
        return rowTopic;
    }


}
