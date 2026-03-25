package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C40778qeP;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qeS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40781qeS extends android.widget.LinearLayout {
    public final C42867reX copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40781qeS(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40781qeS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.qeS.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C40781qeS(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40781qeS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42867reX c42867reXCopydefault = C42867reX.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42867reXCopydefault, "");
        this.copydefault = c42867reXCopydefault;
        setOrientation(0);
        setVisibility(8);
    }

    /* JADX INFO: renamed from: o.qeS$Application */
    public static final class Application implements Function1<java.lang.String, Unit> {
        public final /* synthetic */ java.util.List<java.lang.String> KWHzl;
        public final /* synthetic */ Function1<java.lang.String, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(java.util.List<java.lang.String> list, Function1<? super java.lang.String, Unit> function1) {
            this.KWHzl = list;
            this.copydefault = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            KWHzl(str);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C40781qeS.this.setChoosePeriodCallback(this.KWHzl, str, this.copydefault);
            this.copydefault.invoke(str);
        }
    }

    public static final Unit copydefault(C40781qeS c40781qeS, Function1 function1, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        AppCompatTextView appCompatTextView = c40781qeS.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        c40781qeS.copydefault(appCompatTextView, false);
        java.lang.String string = bundle.getString("date");
        if (string == null) {
            return Unit.INSTANCE;
        }
        c40781qeS.copydefault.EZpvd.setText(string);
        function1.invoke(string);
        return Unit.INSTANCE;
    }

    public final void copydefault(android.widget.TextView textView, boolean z) {
        if (z) {
            C41426qqb.updateDrawable$default(textView, 0, 0, C52761wXj.TaskDescription.dUDNAs, 0, 11, null);
        } else {
            C41426qqb.updateDrawable$default(textView, 0, 0, C52761wXj.TaskDescription.QSLkRj, 0, 11, null);
        }
    }

    public final void setChoosePeriodCallback(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        setVisibility(0);
        this.copydefault.EZpvd.setText(str);
        AppCompatTextView appCompatTextView = this.copydefault.EZpvd;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this, list, str, function1));
    }

    public final void OLrzqt(java.util.List<java.lang.String> list, java.lang.String str, final Function1<? super java.lang.String, Unit> function1) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(this));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
        if (fragment == null) {
            return;
        }
        AppCompatTextView appCompatTextView = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        copydefault(appCompatTextView, true);
        java.lang.String name = C40778qeP.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        jSA.copydefault(fragment, name, new Function2() { // from class: o.qeR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C40781qeS.copydefault(this.copydefault, function1, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        });
        C40778qeP.TaskDescription taskDescription = C40778qeP.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        taskDescription.AEQbTJ(childFragmentManager, list, str);
    }

    /* JADX INFO: renamed from: o.qeS$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C40781qeS AhwBna;
        public final /* synthetic */ java.util.List EZpvd;
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C40781qeS c40781qeS, java.util.List list, java.lang.String str, Function1 function1) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.AhwBna = c40781qeS;
            this.EZpvd = list;
            this.OLrzqt = str;
            this.KWHzl = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C40781qeS c40781qeS = this.AhwBna;
                java.util.List list = this.EZpvd;
                c40781qeS.OLrzqt(list, this.OLrzqt, c40781qeS.new Application(list, this.KWHzl));
            }
        }
    }
}
