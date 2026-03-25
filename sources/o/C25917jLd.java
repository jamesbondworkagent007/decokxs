package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import com.github.mikephil.charting.data.Entry;
import java.math.BigDecimal;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55159xeg;
import o.C55386xiv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jLd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25917jLd extends LinearLayoutCompat {
    public C55170xer AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final Application OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25917jLd(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25917jLd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.jLd.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C25917jLd(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25917jLd(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jLc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25917jLd.AEQbTJ(context, this);
            }
        });
        Application application = new Application();
        this.OLrzqt = application;
        this.AEQbTJ = C55170xer.Companion.copydefault();
        setOrientation(1);
        C55159xeg c55159xeg = copydefault().KWHzl;
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iCopydefault = c33512mxp.isConnected() == 0 ? C33070mpX.copydefault(C52761wXj.Activity.DLGVGj) : C33070mpX.copydefault(C52761wXj.Activity.zzQwtT);
        int iCopydefault2 = c33512mxp.isConnected() == 0 ? C33070mpX.copydefault(C52761wXj.Activity.zzQwtT) : C33070mpX.copydefault(C52761wXj.Activity.DLGVGj);
        c55159xeg.setConfig(new C55098xdY(context, new C55159xeg.Application(iCopydefault, iCopydefault2, C33070mpX.copydefault(C55386xiv.ActionBar.KWHzl), C33070mpX.copydefault(C52761wXj.Activity.ORxRYg), C33070mpX.copydefault(C52761wXj.Activity.htlTjW), iCopydefault, iCopydefault2), null, null, null, null, null, null, null, null, null, null, java.lang.Boolean.FALSE, null, new C55159xeg.TaskDescription(iCopydefault, iCopydefault2, C55298xhM.copydefault(1.0f, context), C55298xhM.copydefault(1.0f, context)), java.lang.Boolean.TRUE, 12284, null).KWHzl());
        c55159xeg.setAdapter(application);
    }

    private final C42832rdp copydefault() {
        return (C42832rdp) this.EZpvd.getValue();
    }

    public static final C42832rdp AEQbTJ(android.content.Context context, C25917jLd c25917jLd) {
        return C42832rdp.KWHzl(android.view.LayoutInflater.from(context), c25917jLd);
    }

    /* JADX INFO: renamed from: o.jLd$Application */
    public final class Application extends C55159xeg.ActionBar<ActionBar> {
        @Override // o.C55159xeg.ActionBar
        public float AEQbTJ() {
            return 1.0f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/xeq;)Ljava/lang/String; */
        @Override // o.C55159xeg.ActionBar
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.String AEQbTJ(@NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            return "";
        }

        @Override // o.C55159xeg.ActionBar
        public void EZpvd() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault(ILo/xeq;)V */
        @Override // o.C55159xeg.ActionBar
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void copydefault(int i, @NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd(ILo/xeq;)V */
        @Override // o.C55159xeg.ActionBar
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(int i, @NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/xeq;)Ljava/lang/String; */
        @Override // o.C55159xeg.ActionBar
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public java.lang.String EZpvd(@NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            return "";
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        @Override // o.C55159xeg.ActionBar
        public C55170xer OLrzqt() {
            return C25917jLd.this.AEQbTJ;
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/xeq;)Z */
        @Override // o.C55159xeg.ActionBar
        public boolean OLrzqt(ActionBar actionBar) {
            java.util.List<ActionBar> listKWHzl = KWHzl();
            if (actionBar == null && (actionBar = (ActionBar) CollectionsKt___CollectionsKt.wlaJM(listKWHzl)) == null) {
                return true;
            }
            BigDecimal bigDecimalSubtract = C33129mqd.EZpvd(actionBar.KWHzl()).subtract(C33129mqd.EZpvd(((ActionBar) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)).KWHzl()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
            return bigDecimalSubtract.compareTo(BigDecimal.ZERO) > 0;
        }
    }

    /* JADX INFO: renamed from: o.jLd$ActionBar */
    public static final class ActionBar implements InterfaceC55169xeq<java.lang.Float> {
        public final long AEQbTJ;
        public final float KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, float f, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                j = actionBar.AEQbTJ;
            }
            return actionBar.EZpvd(f, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(float f, long j) {
            return new ActionBar(f, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return java.lang.Float.compare(this.KWHzl, actionBar.KWHzl) == 0 && this.AEQbTJ == actionBar.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Float.hashCode(this.KWHzl) * 31) + java.lang.Long.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChartDataPointImpl(value=" + this.KWHzl + ", timestamp=" + this.AEQbTJ + ")";
        }

        public ActionBar(float f, long j) {
            this.KWHzl = f;
            this.AEQbTJ = j;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/Number; */
        @Override // o.InterfaceC55169xeq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public java.lang.Float KWHzl() {
            return java.lang.Float.valueOf(this.KWHzl);
        }
    }

    public final void setData(@NotNull java.util.List<? extends Entry> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Application application = this.OLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (Entry entry : list) {
            arrayList.add(new ActionBar(entry.getY(), C33129mqd.valueOf(java.lang.Float.valueOf(entry.getX()))));
        }
        application.KWHzl(arrayList, false);
    }
}
