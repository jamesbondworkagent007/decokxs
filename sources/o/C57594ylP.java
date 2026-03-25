package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57594ylP {
    public static /* synthetic */ void singleClick$default(android.view.View view, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function1, "");
        view.setOnClickListener(new TaskDescription(view, j, function1));
    }

    /* JADX INFO: renamed from: o.ylP$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;

        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function1<T, Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Incorrect types in method signature: (TT;JLkotlin/jvm/functions/Function1<-TT;Lkotlin/Unit;>;)V */
        public TaskDescription(android.view.View view, long j, Function1 function1) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = function1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C57594ylP.AEQbTJ(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C57594ylP.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.invoke((T) this.EZpvd);
            }
        }
    }

    public static /* synthetic */ void singleClick$default(android.view.View view, View.OnClickListener onClickListener, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 1000;
        }
        OLrzqt(view, onClickListener, j);
    }

    public static final <T extends android.view.View> void OLrzqt(@NotNull final T t, @NotNull final View.OnClickListener onClickListener, final long j) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        t.setOnClickListener(new View.OnClickListener() { // from class: o.ylQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C57594ylP.KWHzl(t, j, onClickListener, view);
            }
        });
    }

    public static final void KWHzl(android.view.View view, long j, View.OnClickListener onClickListener, android.view.View view2) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis - AEQbTJ(view) > j || (view instanceof android.widget.Checkable)) {
            OLrzqt(view, jCurrentTimeMillis);
            onClickListener.onClick(view);
        }
    }

    public static final <T extends android.view.View> void OLrzqt(@NotNull T t, long j) {
        Intrinsics.checkNotNullParameter(t, "");
        t.setTag(1766613352, java.lang.Long.valueOf(j));
    }

    public static final <T extends android.view.View> long AEQbTJ(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        java.lang.Object tag = t.getTag(1766613352);
        java.lang.Long l = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
