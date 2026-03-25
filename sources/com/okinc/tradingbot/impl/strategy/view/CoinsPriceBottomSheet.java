package com.okinc.tradingbot.impl.strategy.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.tradingbot.impl.strategy.view.CoinsPriceBottomSheet;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C33070mpX;
import o.C48033uCm;
import o.C52578wQp;
import o.C52761wXj;
import o.C55688xof;
import o.C56390yDp;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.wXQ;
import o.wXX;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class CoinsPriceBottomSheet extends wXX {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static StateFlow<? extends List<CoinPriceItem>> KWHzl;
    public final boolean AEQbTJ;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wQo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return CoinsPriceBottomSheet.OLrzqt(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wQn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return CoinsPriceBottomSheet.copydefault(this.OLrzqt);
        }
    });

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.AVERAGE_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.LAST_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.PRICE_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Parcelable.Creator<Mode> CREATOR;
        public static final Mode AVERAGE_PRICE = new Mode("AVERAGE_PRICE", 0);
        public static final Mode LAST_PRICE = new Mode("LAST_PRICE", 1);
        public static final Mode PRICE_RANGE = new Mode("PRICE_RANGE", 2);

        public static final class Creator implements Parcelable.Creator<Mode> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Mode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return Mode.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Mode[] newArray(int i) {
                return new Mode[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{AVERAGE_PRICE, LAST_PRICE, PRICE_RANGE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Mode> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private Mode(String str, int i) {
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(modeArr$values);
            CREATOR = new Creator();
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.view.CoinsPriceBottomSheet.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ CoinsPriceBottomSheet newInstance$default(Application application, List list, Mode mode, int i, Object obj) {
            if ((i & 2) != 0) {
                mode = Mode.AVERAGE_PRICE;
            }
            return application.copydefault((List<CoinPriceItem>) list, mode);
        }

        public final CoinsPriceBottomSheet copydefault(@NotNull List<CoinPriceItem> list, @NotNull Mode mode) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(mode, "");
            CoinsPriceBottomSheet.KWHzl = null;
            CoinsPriceBottomSheet coinsPriceBottomSheet = new CoinsPriceBottomSheet();
            coinsPriceBottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_items", new ArrayList(list)), C56390yDp.OLrzqt("arg_mode", mode)));
            return coinsPriceBottomSheet;
        }

        public final CoinsPriceBottomSheet copydefault(@NotNull StateFlow<? extends List<CoinPriceItem>> stateFlow, @NotNull Mode mode) {
            Intrinsics.checkNotNullParameter(stateFlow, "");
            Intrinsics.checkNotNullParameter(mode, "");
            CoinsPriceBottomSheet.KWHzl = stateFlow;
            CoinsPriceBottomSheet coinsPriceBottomSheet = new CoinsPriceBottomSheet();
            coinsPriceBottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_mode", mode)));
            return coinsPriceBottomSheet;
        }
    }

    public final List<CoinPriceItem> OLrzqt() {
        return (List) this.copydefault.getValue();
    }

    public static final List OLrzqt(CoinsPriceBottomSheet coinsPriceBottomSheet) {
        ArrayList parcelableArrayList;
        Bundle arguments = coinsPriceBottomSheet.getArguments();
        return (arguments == null || (parcelableArrayList = arguments.getParcelableArrayList("arg_items")) == null) ? yDY.AhwBna() : parcelableArrayList;
    }

    public final Mode AEQbTJ() {
        return (Mode) this.OLrzqt.getValue();
    }

    public static final Mode copydefault(CoinsPriceBottomSheet coinsPriceBottomSheet) {
        Mode mode;
        Bundle arguments = coinsPriceBottomSheet.getArguments();
        return (arguments == null || (mode = (Mode) arguments.getParcelable("arg_mode")) == null) ? Mode.AVERAGE_PRICE : mode;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setCloseVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setDividerVisibility(false);
        TextView textViewAYXKKw = wxq.AYXKKw();
        textViewAYXKKw.setTextAppearance(C52761wXj.LoaderManager.zLjUOn);
        int i = Activity.EZpvd[AEQbTJ().ordinal()];
        if (i == 1) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.OKvQBs);
        } else if (i == 2) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getNavigationMode);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UlpNxW);
        }
        textViewAYXKKw.setText(strAYXKKw);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-443966916, true, new StateListAnimator()));
        constraintLayout.addView(composeView);
    }

    public static final class StateListAnimator implements Function2<Composer, Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, Integer num) {
            OLrzqt(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.wQp.OLrzqt(java.util.List, androidx.compose.runtime.Composer, int):void */
        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [142=4] */
        public final void OLrzqt(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-443966916, i, -1, "com.okinc.tradingbot.impl.strategy.view.CoinsPriceBottomSheet.onCreateContent.<anonymous>.<anonymous> (CoinsPriceBottomSheet.kt:141)");
            }
            StateFlow stateFlow = CoinsPriceBottomSheet.KWHzl;
            composer.startReplaceableGroup(-134096155);
            Unit unit = null;
            if (stateFlow != null) {
                C52578wQp.KWHzl(copydefault(SnapshotStateKt.collectAsState(stateFlow, null, composer, 0, 1)), composer, 0);
                unit = Unit.INSTANCE;
            }
            composer.endReplaceableGroup();
            if (unit == null) {
                C52578wQp.KWHzl(CoinsPriceBottomSheet.this.OLrzqt(), composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        public static final List<CoinPriceItem> copydefault(State<? extends List<CoinPriceItem>> state) {
            return state.getValue();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        KWHzl = null;
    }
}
