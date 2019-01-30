package net.nemanjakovacevic.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import net.nemanjakovacevic.recyclerviewswipetodelete.R;

/**
 * ViewHolder capable of presenting two states: "normal" and "undo" state.
 */
public class TestViewHolder extends RecyclerView.ViewHolder {

   public TextView titleTextView;
    public Button undoButton;

    public TestViewHolder(ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view, parent, false));
        titleTextView = (TextView) itemView.findViewById(R.id.title_text_view);
        undoButton = (Button) itemView.findViewById(R.id.undo_button);
    }

}