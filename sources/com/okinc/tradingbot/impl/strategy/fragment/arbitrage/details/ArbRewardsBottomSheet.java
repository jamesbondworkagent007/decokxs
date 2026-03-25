package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import android.os.CountDownTimer;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.dto.FundingFeeIncomeResponse;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbRewardsBottomSheet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33064mpR;
import o.C56390yDp;
import o.C56392yDr;
import o.C59534zip;
import o.InterfaceC56387yDm;
import o.uMB;
import o.wON;
import o.wXQ;
import o.wXX;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ArbRewardsBottomSheet extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public CountDownTimer AEQbTJ;
    public Function1<? super Long, ? extends CountDownTimer> OLrzqt;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wwa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ArbRewardsBottomSheet.EZpvd(this.AEQbTJ);
        }
    });
    public long valueOf = -1;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wvW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ArbRewardsBottomSheet.AEQbTJ(this.OLrzqt);
        }
    });

    public static final class ArbRewardsBottomSheetUiModel implements Parcelable {
        public static final Parcelable.Creator<ArbRewardsBottomSheetUiModel> CREATOR = new Creator();
        public final String AEQbTJ;
        public final int AYXKKw;
        public final List<FundingFeeIncomeResponse> EZpvd;
        public final CharSequence KWHzl;
        public final int OLrzqt;
        public final CharSequence copydefault;
        public final CharSequence valueOf;

        public static final class Creator implements Parcelable.Creator<ArbRewardsBottomSheetUiModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ArbRewardsBottomSheetUiModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                CharSequence charSequence = (CharSequence) creator.createFromParcel(parcel);
                int i = parcel.readInt();
                CharSequence charSequence2 = (CharSequence) creator.createFromParcel(parcel);
                CharSequence charSequence3 = (CharSequence) creator.createFromParcel(parcel);
                int i2 = parcel.readInt();
                String string = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(FundingFeeIncomeResponse.CREATOR.createFromParcel(parcel));
                }
                return new ArbRewardsBottomSheetUiModel(charSequence, i, charSequence2, charSequence3, i2, string, arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ArbRewardsBottomSheetUiModel[] newArray(int i) {
                return new ArbRewardsBottomSheetUiModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ArbRewardsBottomSheetUiModel() {
            this(null, 0, null, null, 0, null, null, 127, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbRewardsBottomSheet$ArbRewardsBottomSheetUiModel */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ArbRewardsBottomSheetUiModel copy$default(ArbRewardsBottomSheetUiModel arbRewardsBottomSheetUiModel, CharSequence charSequence, int i, CharSequence charSequence2, CharSequence charSequence3, int i2, String str, List list, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                charSequence = arbRewardsBottomSheetUiModel.KWHzl;
            }
            if ((i3 & 2) != 0) {
                i = arbRewardsBottomSheetUiModel.OLrzqt;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                charSequence2 = arbRewardsBottomSheetUiModel.valueOf;
            }
            CharSequence charSequence4 = charSequence2;
            if ((i3 & 8) != 0) {
                charSequence3 = arbRewardsBottomSheetUiModel.copydefault;
            }
            CharSequence charSequence5 = charSequence3;
            if ((i3 & 16) != 0) {
                i2 = arbRewardsBottomSheetUiModel.AYXKKw;
            }
            int i5 = i2;
            if ((i3 & 32) != 0) {
                str = arbRewardsBottomSheetUiModel.AEQbTJ;
            }
            String str2 = str;
            if ((i3 & 64) != 0) {
                list = arbRewardsBottomSheetUiModel.EZpvd;
            }
            return arbRewardsBottomSheetUiModel.AEQbTJ(charSequence, i4, charSequence4, charSequence5, i5, str2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArbRewardsBottomSheetUiModel AEQbTJ(@NotNull CharSequence charSequence, @ColorInt int i, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, @ColorInt int i2, @NotNull String str, @NotNull List<FundingFeeIncomeResponse> list) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new ArbRewardsBottomSheetUiModel(charSequence, i, charSequence2, charSequence3, i2, str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<FundingFeeIncomeResponse> copydefault() {
            return this.EZpvd;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArbRewardsBottomSheetUiModel)) {
                return false;
            }
            ArbRewardsBottomSheetUiModel arbRewardsBottomSheetUiModel = (ArbRewardsBottomSheetUiModel) obj;
            return Intrinsics.EZpvd(this.KWHzl, arbRewardsBottomSheetUiModel.KWHzl) && this.OLrzqt == arbRewardsBottomSheetUiModel.OLrzqt && Intrinsics.EZpvd(this.valueOf, arbRewardsBottomSheetUiModel.valueOf) && Intrinsics.EZpvd(this.copydefault, arbRewardsBottomSheetUiModel.copydefault) && this.AYXKKw == arbRewardsBottomSheetUiModel.AYXKKw && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) arbRewardsBottomSheetUiModel.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, arbRewardsBottomSheetUiModel.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.KWHzl.hashCode() * 31) + Integer.hashCode(this.OLrzqt)) * 31) + this.valueOf.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + Integer.hashCode(this.AYXKKw)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            CharSequence charSequence = this.KWHzl;
            int i = this.OLrzqt;
            CharSequence charSequence2 = this.valueOf;
            CharSequence charSequence3 = this.copydefault;
            return "ArbRewardsBottomSheetUiModel(apy=" + ((Object) charSequence) + ", apyColor=" + i + ", pnlTitle=" + ((Object) charSequence2) + ", pnl=" + ((Object) charSequence3) + ", pnlColor=" + this.AYXKKw + ", ccy=" + this.AEQbTJ + ", dataList=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            TextUtils.writeToParcel(this.KWHzl, parcel, i);
            parcel.writeInt(this.OLrzqt);
            TextUtils.writeToParcel(this.valueOf, parcel, i);
            TextUtils.writeToParcel(this.copydefault, parcel, i);
            parcel.writeInt(this.AYXKKw);
            parcel.writeString(this.AEQbTJ);
            List<FundingFeeIncomeResponse> list = this.EZpvd;
            parcel.writeInt(list.size());
            Iterator<FundingFeeIncomeResponse> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }

        public ArbRewardsBottomSheetUiModel(@NotNull CharSequence charSequence, @ColorInt int i, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, @ColorInt int i2, @NotNull String str, @NotNull List<FundingFeeIncomeResponse> list) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = charSequence;
            this.OLrzqt = i;
            this.valueOf = charSequence2;
            this.copydefault = charSequence3;
            this.AYXKKw = i2;
            this.AEQbTJ = str;
            this.EZpvd = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.CharSequence))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0011: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.CharSequence))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x002f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r12v0 java.util.List))
 A[MD:(java.lang.CharSequence, int, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.String, java.util.List<com.okinc.tradingbot.impl.dto.FundingFeeIncomeResponse>):void (m)] (LINE:24) call: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbRewardsBottomSheet.ArbRewardsBottomSheetUiModel.<init>(java.lang.CharSequence, int, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ ArbRewardsBottomSheetUiModel(CharSequence charSequence, int i, CharSequence charSequence2, CharSequence charSequence3, int i2, String str, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : charSequence, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : charSequence2, (i3 & 8) != 0 ? "" : charSequence3, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) == 0 ? str : "", (i3 & 64) != 0 ? yDY.AhwBna() : list);
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbRewardsBottomSheet.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void OLrzqt(@NotNull FragmentManager fragmentManager, @NotNull ArbRewardsBottomSheetUiModel arbRewardsBottomSheetUiModel) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(arbRewardsBottomSheetUiModel, "");
            ArbRewardsBottomSheet arbRewardsBottomSheet = new ArbRewardsBottomSheet();
            arbRewardsBottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("DATA_KEY", arbRewardsBottomSheetUiModel)));
            arbRewardsBottomSheet.show(fragmentManager);
        }
    }

    public final ArbRewardsBottomSheetUiModel copydefault() {
        return (ArbRewardsBottomSheetUiModel) this.EZpvd.getValue();
    }

    public static final ArbRewardsBottomSheetUiModel EZpvd(ArbRewardsBottomSheet arbRewardsBottomSheet) {
        ArbRewardsBottomSheetUiModel arbRewardsBottomSheetUiModel = (ArbRewardsBottomSheetUiModel) arbRewardsBottomSheet.requireArguments().getParcelable("DATA_KEY");
        return arbRewardsBottomSheetUiModel == null ? new ArbRewardsBottomSheetUiModel(null, 0, null, null, 0, null, null, 127, null) : arbRewardsBottomSheetUiModel;
    }

    private final C59534zip EZpvd() {
        return (C59534zip) this.KWHzl.getValue();
    }

    public static final C59534zip AEQbTJ(final ArbRewardsBottomSheet arbRewardsBottomSheet) {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(FundingFeeIncomeResponse.class, new wON(arbRewardsBottomSheet.copydefault().EZpvd(), new Function2() { // from class: o.wvZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ArbRewardsBottomSheet.KWHzl(this.copydefault, ((java.lang.Long) obj).longValue(), (Function1) obj2);
            }
        }));
        return c59534zip;
    }

    public static final Unit KWHzl(ArbRewardsBottomSheet arbRewardsBottomSheet, long j, Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (j < arbRewardsBottomSheet.valueOf) {
            return Unit.INSTANCE;
        }
        arbRewardsBottomSheet.valueOf = j;
        arbRewardsBottomSheet.OLrzqt = function1;
        arbRewardsBottomSheet.AEQbTJ();
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        uMB umbOLrzqt = uMB.OLrzqt(getLayoutInflater(), constraintLayout, true);
        TextView textView = umbOLrzqt.EZpvd;
        textView.setText(copydefault().AEQbTJ());
        textView.setTextColor(copydefault().KWHzl());
        umbOLrzqt.AEQbTJ.setText(copydefault().gEmmrt());
        TextView textView2 = umbOLrzqt.OLrzqt;
        textView2.setText(copydefault().OLrzqt());
        textView2.setTextColor(copydefault().djBIcL());
        RecyclerView recyclerView = umbOLrzqt.djBIcL;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(EZpvd());
        C33064mpR.OLrzqt(EZpvd(), copydefault().copydefault());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AEQbTJ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        OLrzqt();
    }

    private final void AEQbTJ() {
        OLrzqt();
        long j = this.valueOf;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Function1<? super Long, ? extends CountDownTimer> function1 = this.OLrzqt;
        this.AEQbTJ = function1 != null ? function1.invoke(Long.valueOf(j - jCurrentTimeMillis)) : null;
    }

    private final void OLrzqt() {
        CountDownTimer countDownTimer = this.AEQbTJ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.AEQbTJ = null;
    }
}
