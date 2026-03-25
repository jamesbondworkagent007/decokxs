package com.okinc.liveness.lca.debugtool.ui;

import android.support.v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.liveness.lca.debugtool.ui.LcaSampleChunkAdapter;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C45699suv;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaSampleChunkAdapter extends RecyclerView.Adapter<LcaSampleChunkViewHolder> {
    public static final int $stable = 8;
    public List<? extends File> chunks;
    public final Function1<File, Unit> onChunkClick;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public LcaSampleChunkAdapter(@NotNull List<? extends File> list, @NotNull Function1<? super File, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.chunks = list;
        this.onChunkClick = function1;
    }

    public final void updateChunks(@NotNull List<? extends File> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chunks = list;
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public LcaSampleChunkViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C45699suv c45699suvKWHzl = C45699suv.KWHzl(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c45699suvKWHzl, "");
        return new LcaSampleChunkViewHolder(c45699suvKWHzl, this.onChunkClick);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull LcaSampleChunkViewHolder lcaSampleChunkViewHolder, int i) {
        Intrinsics.checkNotNullParameter(lcaSampleChunkViewHolder, "");
        final File file = this.chunks.get(i);
        lcaSampleChunkViewHolder.bind(file);
        lcaSampleChunkViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaSampleChunkAdapter$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaSampleChunkAdapter.onBindViewHolder$lambda$0(this.f$0, file, view);
            }
        });
    }

    public static final void onBindViewHolder$lambda$0(LcaSampleChunkAdapter lcaSampleChunkAdapter, File file, View view) {
        lcaSampleChunkAdapter.onChunkClick.invoke(file);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.chunks.size();
    }

    public static final class LcaSampleChunkViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        public final C45699suv binding;
        public File currentFile;
        public final Function1<File, Unit> onChunkClick;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C45699suv getBinding() {
            return this.binding;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LcaSampleChunkViewHolder(@NotNull C45699suv c45699suv, @NotNull Function1<? super File, Unit> function1) {
            super(c45699suv.getRoot());
            Intrinsics.checkNotNullParameter(c45699suv, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.binding = c45699suv;
            this.onChunkClick = function1;
        }

        public final void bind(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "");
            this.currentFile = file;
            this.binding.KWHzl.setText(file.getName());
            this.binding.copydefault.setText(formatFileSize(file.length()));
            this.binding.EZpvd.setText(formatLastModified(file.lastModified()));
            this.binding.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaSampleChunkAdapter$LcaSampleChunkViewHolder$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LcaSampleChunkAdapter.LcaSampleChunkViewHolder.bind$lambda$1(this.f$0, view);
                }
            });
        }

        public static final void bind$lambda$1(LcaSampleChunkViewHolder lcaSampleChunkViewHolder, View view) {
            File file = lcaSampleChunkViewHolder.currentFile;
            if (file != null) {
                lcaSampleChunkViewHolder.onChunkClick.invoke(file);
            }
        }

        public final String formatFileSize(long j) {
            if (j < 1024) {
                return j + " B";
            }
            if (j < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                return (j / ((long) 1024)) + " KB";
            }
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            String str = String.format(Locale.US, "%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1048576.0d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }

        public final String formatLastModified(long j) {
            String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }
    }
}
