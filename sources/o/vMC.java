package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vMC extends ConstraintLayout {
    public final C43316rmw OLrzqt;
    public AbstractC48513uUe copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vMC(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vMC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.vMC.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ vMC(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vMC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new C43316rmw();
        AEQbTJ();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vMC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final void AEQbTJ() {
        AbstractC48513uUe abstractC48513uUe = (AbstractC48513uUe) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.DcMfJKDcMfJK, this, true);
        this.copydefault = abstractC48513uUe;
        if (abstractC48513uUe == null) {
            Intrinsics.gEmmrt("");
            abstractC48513uUe = null;
        }
        abstractC48513uUe.OLrzqt.setLayoutManager(new LinearLayoutManager(getContext()));
        AbstractC48513uUe abstractC48513uUe2 = this.copydefault;
        if (abstractC48513uUe2 == null) {
            Intrinsics.gEmmrt("");
            abstractC48513uUe2 = null;
        }
        abstractC48513uUe2.OLrzqt.setAdapter(this.OLrzqt);
        AbstractC48513uUe abstractC48513uUe3 = this.copydefault;
        if (abstractC48513uUe3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48513uUe3 = null;
        }
        abstractC48513uUe3.OLrzqt.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(12.0f, null, 1, null), 0));
        this.OLrzqt.register(TacticsInsideItemData.class, new wNQ());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vMC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setMatchResult$default(vMC vmc, java.lang.String str, java.util.ArrayList arrayList, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            arrayList = null;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        vmc.setMatchResult(str, arrayList, str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setMatchResult(@NotNull java.lang.String str, java.util.ArrayList<TacticsInsideItemData> arrayList, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            AbstractC48513uUe abstractC48513uUe = this.copydefault;
            if (abstractC48513uUe == null) {
                Intrinsics.gEmmrt("");
                abstractC48513uUe = null;
            }
            abstractC48513uUe.AEQbTJ.setText(str2);
        }
        copydefault(str);
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    if (arrayList == null || arrayList.isEmpty()) {
                        KWHzl();
                        return;
                    } else {
                        C33064mpR.OLrzqt(this.OLrzqt, (java.util.List<? extends java.lang.Object>) arrayList);
                        return;
                    }
                }
                break;
            case 49:
                if (str.equals("1")) {
                    return;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return;
                }
                break;
        }
        KWHzl();
        pUU.KWHzl("DcdAdvancedProductMatchView", "state " + str);
    }

    public final void copydefault(java.lang.String str) {
        AbstractC48513uUe abstractC48513uUe = this.copydefault;
        AbstractC48513uUe abstractC48513uUe2 = null;
        if (abstractC48513uUe == null) {
            Intrinsics.gEmmrt("");
            abstractC48513uUe = null;
        }
        RecyclerView recyclerView = abstractC48513uUe.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") ? 0 : 8);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
            AbstractC48513uUe abstractC48513uUe3 = this.copydefault;
            if (abstractC48513uUe3 == null) {
                Intrinsics.gEmmrt("");
                abstractC48513uUe3 = null;
            }
            C55113xdn.showLoading$default(abstractC48513uUe3.copydefault, 0L, 1, null);
        } else {
            AbstractC48513uUe abstractC48513uUe4 = this.copydefault;
            if (abstractC48513uUe4 == null) {
                Intrinsics.gEmmrt("");
                abstractC48513uUe4 = null;
            }
            abstractC48513uUe4.copydefault.copydefault();
        }
        AbstractC48513uUe abstractC48513uUe5 = this.copydefault;
        if (abstractC48513uUe5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48513uUe2 = abstractC48513uUe5;
        }
        C55173xeu c55173xeu = abstractC48513uUe2.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "2") ? 0 : 8);
    }

    private final void KWHzl() {
        AbstractC48513uUe abstractC48513uUe = this.copydefault;
        AbstractC48513uUe abstractC48513uUe2 = null;
        if (abstractC48513uUe == null) {
            Intrinsics.gEmmrt("");
            abstractC48513uUe = null;
        }
        RecyclerView recyclerView = abstractC48513uUe.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(8);
        AbstractC48513uUe abstractC48513uUe3 = this.copydefault;
        if (abstractC48513uUe3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48513uUe3 = null;
        }
        abstractC48513uUe3.copydefault.copydefault();
        AbstractC48513uUe abstractC48513uUe4 = this.copydefault;
        if (abstractC48513uUe4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48513uUe4 = null;
        }
        C55113xdn c55113xdn = abstractC48513uUe4.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(8);
        AbstractC48513uUe abstractC48513uUe5 = this.copydefault;
        if (abstractC48513uUe5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48513uUe2 = abstractC48513uUe5;
        }
        C55173xeu c55173xeu = abstractC48513uUe2.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(0);
    }
}
