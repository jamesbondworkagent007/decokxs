package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57585ylG extends android.widget.FrameLayout {
    public Function0<Unit> AEQbTJ;
    public android.widget.TextView EZpvd;
    public android.widget.ImageView KWHzl;
    public android.widget.TextView OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeRealTv(android.widget.TextView textView) {
        this.OLrzqt = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnRealChangeClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleTV(android.widget.TextView textView) {
        this.EZpvd = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserIconClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserImg(android.widget.ImageView imageView) {
        this.KWHzl = imageView;
    }

    /* JADX INFO: renamed from: o.ylG$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C57585ylG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C57585ylG c57585ylG) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c57585ylG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C57594ylP.AEQbTJ(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C57594ylP.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.copydefault.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ylG$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C57585ylG KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C57585ylG c57585ylG) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c57585ylG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C57594ylP.AEQbTJ(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C57594ylP.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl.AEQbTJ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57585ylG(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57585ylG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57585ylG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd();
    }

    public final void EZpvd() {
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C32113mPz.Fragment.AuCTelauCTel, this);
        this.KWHzl = (android.widget.ImageView) viewInflate.findViewById(C32113mPz.FragmentManager.giSNqX);
        this.OLrzqt = (android.widget.TextView) viewInflate.findViewById(C32113mPz.FragmentManager.flVtFt);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C32113mPz.FragmentManager.gasjUx);
        this.EZpvd = textView;
        if (textView != null) {
            C33566myq c33566myq = C33566myq.EZpvd;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iEZpvd = c33566myq.EZpvd(context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textView.setMaxWidth(((iEZpvd - C33052mpF.EZpvd(56.0f, context2)) / 3) * 2);
        }
        android.widget.ImageView imageView = this.KWHzl;
        if (imageView != null) {
            imageView.setOnClickListener(new Activity(imageView, 1000L, this));
        }
        android.widget.TextView textView2 = this.OLrzqt;
        if (textView2 != null) {
            textView2.setOnClickListener(new TaskDescription(textView2, 1000L, this));
        }
    }

    public final void setText(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.widget.TextView textView = this.EZpvd;
        if (textView != null) {
            textView.setText(str);
        }
        android.widget.TextView textView2 = this.OLrzqt;
        if (textView2 != null) {
            textView2.setText(str2);
        }
    }
}
