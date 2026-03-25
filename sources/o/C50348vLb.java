package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.ViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC49732uuB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vLb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50348vLb extends android.widget.FrameLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public java.lang.String AhwBna;
    public java.lang.String KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final AbstractC49530uqL copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50348vLb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50348vLb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.gEmmrt = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(Function1<? super java.lang.String, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.vLb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C50348vLb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50348vLb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vLd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50348vLb.djBIcL(this.AEQbTJ);
            }
        });
        this.AhwBna = "1";
        AbstractC49530uqL abstractC49530uqLCopydefault = AbstractC49530uqL.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC49530uqLCopydefault, "");
        this.copydefault = abstractC49530uqLCopydefault;
        C55052xcf c55052xcf = abstractC49530uqLCopydefault.AEQbTJ;
        c55052xcf.setOnClickListener(new StateListAnimator(c55052xcf, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.fragment.app.FragmentManager EZpvd() {
        return (androidx.fragment.app.FragmentManager) this.OLrzqt.getValue();
    }

    public static final androidx.fragment.app.FragmentManager djBIcL(C50348vLb c50348vLb) {
        return ViewKt.findFragment(c50348vLb).getChildFragmentManager();
    }

    /* JADX INFO: renamed from: o.vLb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vLb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.vLb$Activity */
    public static final class Activity implements Function1<android.content.Context, Unit> {
        public static final Activity EZpvd = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(android.content.Context context) {
            KWHzl(context);
            return Unit.INSTANCE;
        }

        public final void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            C53685wqE.copydefault.OLrzqt().EZpvd(context);
        }
    }

    /* JADX INFO: renamed from: o.vLb$Application */
    public static final class Application implements Function1<android.content.Context, Unit> {
        public static final Application EZpvd = new Application();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(android.content.Context context) {
            OLrzqt(context);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
            if (fragmentActivity != null) {
                C53685wqE.copydefault.KWHzl().EZpvd(fragmentActivity);
            }
        }
    }

    /* JADX INFO: renamed from: o.vLb$TaskDescription */
    public static final class TaskDescription implements Function1<java.lang.String, Unit> {
        public final /* synthetic */ C50348vLb OLrzqt;
        public final /* synthetic */ AbstractC49732uuB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(AbstractC49732uuB abstractC49732uuB, C50348vLb c50348vLb) {
            this.copydefault = abstractC49732uuB;
            this.OLrzqt = c50348vLb;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            OLrzqt(str);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault.dismiss();
            this.OLrzqt.KWHzl(str);
        }
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        this.copydefault.AEQbTJ.setTitle(C56033xvF.getBotLever$default(str, false, 2, null));
        Function1<? super java.lang.String, Unit> function1 = this.AEQbTJ;
        if (function1 != null) {
            function1.invoke(str);
        }
    }

    public final C55052xcf copydefault() {
        return this.copydefault.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.vLb$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C50348vLb OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50348vLb c50348vLb) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c50348vLb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                AbstractC49732uuB.StateListAnimator stateListAnimator = AbstractC49732uuB.Companion;
                java.lang.String str = this.OLrzqt.KWHzl;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = this.OLrzqt.gEmmrt;
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = str;
                AbstractC49732uuB abstractC49732uuBAEQbTJ = stateListAnimator.AEQbTJ(str3, str2, "", "", (24192 & 16) != 0 ? null : null, (24192 & 32) != 0 ? null : null, this.OLrzqt.AhwBna, (24192 & 128) != 0 ? null : null, "", (24192 & 512) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 1024) != 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE, (24192 & 2048) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 4096) != 0 ? null : null, (24192 & 8192) != 0 ? null : null, (24192 & 16384) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 32768) != 0 ? false : false, Activity.EZpvd, Application.EZpvd);
                if (abstractC49732uuBAEQbTJ instanceof C49883uwu) {
                    ((C49883uwu) abstractC49732uuBAEQbTJ).copydefault(new TaskDescription(abstractC49732uuBAEQbTJ, this.OLrzqt));
                }
                androidx.fragment.app.FragmentManager fragmentManagerEZpvd = this.OLrzqt.EZpvd();
                if (fragmentManagerEZpvd == null) {
                    return;
                }
                abstractC49732uuBAEQbTJ.show(fragmentManagerEZpvd, "ContractGridLeverView");
            }
        }
    }
}
