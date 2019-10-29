package id.ac.polinema.recyclerviewsangatsederhana.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class SuperHeroAdapter extends RecyclerView.Adapter<SuperHeroAdapter.ViewHolder> {
    List<SuperHero> heroes;

    public SuperHeroAdapter(List<SuperHero> heroes) {
        this.heroes = heroes;
    }

    @NonNull
    @Override
    public SuperHeroAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View superHeroView = layoutInflater.inflate(R.layout.item_super_hero, parent, false);
        ViewHolder viewHolder = new ViewHolder(superHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SuperHeroAdapter.ViewHolder holder, int position) {
        SuperHero hero = heroes.get(position);
        holder.heroName.setText(hero.getHeroName());
    }

    @Override
    public int getItemCount() {
        return (heroes != null) ? heroes.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView heroName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            heroName = itemView.findViewById(R.id.heroName);
        }
    }
}
