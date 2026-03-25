package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vWq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50660vWq extends ConstraintLayout {
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50660vWq(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50660vWq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.vWq.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C50660vWq(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50660vWq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater.from(context).inflate(C48033uCm.Activity.DDDCac, (android.view.ViewGroup) this, true);
        android.widget.TextView textView = (android.widget.TextView) findViewById(C48033uCm.Application.allOf);
        this.OLrzqt = textView;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(C48033uCm.Application.sRzUNh);
        this.copydefault = textView2;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(C48033uCm.Application.UimiPOhkCVbT);
        this.KWHzl = imageView;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.QbewEr, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            java.lang.CharSequence text = typedArrayObtainStyledAttributes.getText(C48033uCm.LoaderManager.RJOkX);
            java.lang.CharSequence text2 = typedArrayObtainStyledAttributes.getText(C48033uCm.LoaderManager.QUSxYX);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.QVAiDq, 0);
            textView.setText(text2);
            textView2.setText(text);
            if (resourceId != 0) {
                imageView.setImageResource(resourceId);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void setTitleText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.setText(str);
    }

    public final void setContentText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.setText(str);
    }

    public final void setIconIcon(int i) {
        this.KWHzl.setImageResource(i);
    }

    public final void setClickListener(@NotNull Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        android.widget.TextView textView = this.copydefault;
        textView.setOnClickListener(new Application(textView, 1000L, function1));
        android.widget.ImageView imageView = this.KWHzl;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, function1));
    }

    /* JADX INFO: renamed from: o.vWq$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function1 function1) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.invoke((android.widget.TextView) this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.vWq$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ Function1 AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function1 function1) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.invoke((android.widget.ImageView) this.copydefault);
            }
        }
    }
}
