package il.co.beeart.cerenresepies;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

interface RecipesListAdapterListener {
    @NonNull
    View getView(LayoutInflater inflater, int position, @Nullable View convertView, @NonNull ViewGroup parent);
}
