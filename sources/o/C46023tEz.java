package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tEz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46023tEz extends androidx.recyclerview.widget.ListAdapter<InterfaceC46065tGn, RecyclerView.ViewHolder> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final boolean AEQbTJ;
    public final Function1<C46068tGq, Unit> EZpvd;
    public final Function0<Unit> KWHzl;
    public final Function1<java.lang.String, Unit> OLrzqt;
    public final Function1<C46068tGq, Unit> copydefault;
    public final Function2<java.lang.String, java.lang.String, Unit> djBIcL;
    public final PlanetTradeTypes gEmmrt;

    /* JADX INFO: renamed from: o.tEz$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PlanetTradeTypes.values().length];
            try {
                iArr[PlanetTradeTypes.Spot.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PlanetTradeTypes.Swap.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.tGq, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.tGq, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46023tEz(@NotNull PlanetTradeTypes planetTradeTypes, @NotNull Function1<? super C46068tGq, Unit> function1, @NotNull Function1<? super C46068tGq, Unit> function12, @NotNull Function0<Unit> function0, boolean z, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2, Function1<? super java.lang.String, Unit> function13) {
        super(C46020tEw.KWHzl);
        Intrinsics.checkNotNullParameter(planetTradeTypes, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.gEmmrt = planetTradeTypes;
        this.copydefault = function1;
        this.EZpvd = function12;
        this.KWHzl = function0;
        this.AEQbTJ = z;
        this.djBIcL = function2;
        this.OLrzqt = function13;
    }

    /* JADX INFO: renamed from: o.tEz$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tEz.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        InterfaceC46065tGn item = getItem(i);
        if (!(item instanceof C46068tGq)) {
            return 3;
        }
        C46068tGq c46068tGq = (C46068tGq) item;
        int i2 = Application.copydefault[c46068tGq.fetchVPNInfo().ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return c46068tGq.AuCTelauCTel() ? 2 : 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i != 0 && i != 1) {
            if (i == 2) {
                C46278tOk c46278tOkAEQbTJ = C46278tOk.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(c46278tOkAEQbTJ, "");
                c46278tOkAEQbTJ.EZpvd.djBIcL.setHint(true);
                c46278tOkAEQbTJ.EZpvd.DbNXlk.setText(C33070mpX.AYXKKw(C47501trL.Fragment.gasjUx));
                c46278tOkAEQbTJ.EZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C47501trL.Fragment.dxcTrN));
                return new tEU(c46278tOkAEQbTJ, this.copydefault, this.EZpvd, this.KWHzl, this.OLrzqt);
            }
            if (i == 3) {
                android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                textView.setPadding(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(19.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(19.0f, null, 1, null));
                textView.setGravity(17);
                textView.setTextAppearance(C32113mPz.Dialog.fIwbmz);
                textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
                textView.setLayoutParams(layoutParams);
                return new tEE(textView);
            }
            throw new java.lang.IllegalStateException("unknown viewType " + i);
        }
        C46278tOk c46278tOkAEQbTJ2 = C46278tOk.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c46278tOkAEQbTJ2, "");
        c46278tOkAEQbTJ2.EZpvd.djBIcL.setHint(true);
        C55251xgS c55251xgS = c46278tOkAEQbTJ2.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(i == 1 ? 8 : 0);
        C55251xgS c55251xgS2 = c46278tOkAEQbTJ2.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        c55251xgS2.setVisibility(i == 1 ? 8 : 0);
        C55251xgS c55251xgS3 = c46278tOkAEQbTJ2.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
        c55251xgS3.setVisibility(i == 1 ? 8 : 0);
        int i2 = Application.copydefault[this.gEmmrt.ordinal()];
        if (i2 == 1) {
            c46278tOkAEQbTJ2.EZpvd.DbNXlk.setText(C33070mpX.AYXKKw(C47501trL.Fragment.dvKsVJ));
            c46278tOkAEQbTJ2.EZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C47501trL.Fragment.flVtFt));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c46278tOkAEQbTJ2.EZpvd.DbNXlk.setText(C33070mpX.AYXKKw(C47501trL.Fragment.gasjUx));
            c46278tOkAEQbTJ2.EZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C47501trL.Fragment.dxcTrN));
        }
        return new C46011tEn(c46278tOkAEQbTJ2, this.copydefault, this.EZpvd, this.KWHzl, this.AEQbTJ, this.djBIcL, this.OLrzqt);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof C46018tEu) {
            InterfaceC46065tGn item = getItem(i);
            Intrinsics.copydefault(item, "");
            ((C46018tEu) viewHolder).OLrzqt((C46068tGq) item);
        } else if (viewHolder instanceof tEE) {
            ((tEE) viewHolder).EZpvd();
        }
    }
}
