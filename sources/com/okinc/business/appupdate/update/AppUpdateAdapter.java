package com.okinc.business.appupdate.update;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.appupdate.R;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUpdateAdapter extends RecyclerView.Adapter<MyViewHolder> {
    public static final int $stable = 8;
    private final List<String> contents;
    private final Context context;

    public AppUpdateAdapter(@NotNull Context context, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.context = context;
        this.contents = list;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MyViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        View viewInflate = LayoutInflater.from(this.context).inflate(R.layout.upgrade_layout_update_item, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new MyViewHolder(this, viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.contents.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MyViewHolder myViewHolder, int i) {
        Intrinsics.checkNotNullParameter(myViewHolder, "");
        if (getItemCount() == 1) {
            myViewHolder.getLineNumber().setVisibility(8);
        } else {
            myViewHolder.getLineNumber().setVisibility(0);
            myViewHolder.getLineNumber().setText((i + 1) + JwtUtilsKt.JWT_DELIMITER);
            if (getItemCount() < 10) {
                TextView lineNumber = myViewHolder.getLineNumber();
                ViewGroup.LayoutParams layoutParams = lineNumber.getLayoutParams();
                if (layoutParams != null) {
                    Context context = myViewHolder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    layoutParams.width = C55298xhM.OLrzqt(14, context);
                    lineNumber.setLayoutParams(layoutParams);
                    myViewHolder.getLineNumber().setGravity(8388611);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else {
                TextView lineNumber2 = myViewHolder.getLineNumber();
                ViewGroup.LayoutParams layoutParams2 = lineNumber2.getLayoutParams();
                if (layoutParams2 != null) {
                    Context context2 = myViewHolder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    layoutParams2.width = C55298xhM.OLrzqt(26, context2);
                    lineNumber2.setLayoutParams(layoutParams2);
                    myViewHolder.getLineNumber().setGravity(8388613);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        myViewHolder.getPmName().setText(this.contents.get(i));
    }

    public final class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView lineNumber;
        private final TextView pmName;
        final /* synthetic */ AppUpdateAdapter this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TextView getLineNumber() {
            return this.lineNumber;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TextView getPmName() {
            return this.pmName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyViewHolder(@NotNull AppUpdateAdapter appUpdateAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.this$0 = appUpdateAdapter;
            View viewFindViewById = view.findViewById(R.id.line_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.lineNumber = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.update_info);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.pmName = (TextView) viewFindViewById2;
        }
    }
}
