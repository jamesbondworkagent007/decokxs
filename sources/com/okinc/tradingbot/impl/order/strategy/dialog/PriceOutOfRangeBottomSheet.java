package com.okinc.tradingbot.impl.order.strategy.dialog;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import com.okinc.tradingbot.impl.order.strategy.dialog.PriceOutOfRangeBottomSheet;
import com.okinc.tradingbot.impl.utils.PriceRangeUtil;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C38307pTy;
import o.C48357uOm;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C55688xof;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.InterfaceC56387yDm;
import o.pTB;
import o.wXQ;
import o.wXX;
import o.wYF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class PriceOutOfRangeBottomSheet extends wXX {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public Function0<Unit> AhwBna;
    public Function1<? super PriceRangeUtil.ValidatedPriceRange, Unit> OLrzqt;
    public C48357uOm copydefault;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vNC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PriceOutOfRangeBottomSheet.djBIcL(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vND
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PriceOutOfRangeBottomSheet.gEmmrt(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vNE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PriceOutOfRangeBottomSheet.AhwBna(this.EZpvd);
        }
    });

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PriceRangeUtil.ValidatedPriceRange.values().length];
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.ExtremeLowerOutOfRange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.ExtremeUpperOutOfRange.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.LowerOutOfRange.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.UpperOutOfRange.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public final PriceOutOfRangeBottomSheetInput EZpvd() {
        return (PriceOutOfRangeBottomSheetInput) this.KWHzl.getValue();
    }

    public static final PriceOutOfRangeBottomSheetInput djBIcL(PriceOutOfRangeBottomSheet priceOutOfRangeBottomSheet) {
        Bundle arguments = priceOutOfRangeBottomSheet.getArguments();
        if (arguments != null) {
            return (PriceOutOfRangeBottomSheetInput) arguments.getParcelable("price_out_of_range_input");
        }
        return null;
    }

    public final PriceRangeUtil.ValidatedPriceRange copydefault() {
        return (PriceRangeUtil.ValidatedPriceRange) this.djBIcL.getValue();
    }

    public static final PriceRangeUtil.ValidatedPriceRange gEmmrt(PriceOutOfRangeBottomSheet priceOutOfRangeBottomSheet) {
        Bundle arguments = priceOutOfRangeBottomSheet.getArguments();
        if (arguments != null) {
            return (PriceRangeUtil.ValidatedPriceRange) arguments.getParcelable("validation_result");
        }
        return null;
    }

    public final String KWHzl() {
        return (String) this.AEQbTJ.getValue();
    }

    public static final String AhwBna(PriceOutOfRangeBottomSheet priceOutOfRangeBottomSheet) {
        Bundle arguments = priceOutOfRangeBottomSheet.getArguments();
        if (arguments != null) {
            return arguments.getString("magnitude");
        }
        return null;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.dialog.PriceOutOfRangeBottomSheet.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void EZpvd(@NotNull FragmentManager fragmentManager, @NotNull PriceOutOfRangeBottomSheetInput priceOutOfRangeBottomSheetInput, @NotNull Function1<? super PriceRangeUtil.ValidatedPriceRange, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(priceOutOfRangeBottomSheetInput, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Pair<PriceRangeUtil.ValidatedPriceRange, String> pairOLrzqt = PriceRangeUtil.AEQbTJ.OLrzqt(priceOutOfRangeBottomSheetInput.KWHzl(), priceOutOfRangeBottomSheetInput.OLrzqt(), priceOutOfRangeBottomSheetInput.AEQbTJ());
            PriceRangeUtil.ValidatedPriceRange validatedPriceRangeComponent1 = pairOLrzqt.component1();
            String strComponent2 = pairOLrzqt.component2();
            if (validatedPriceRangeComponent1 == PriceRangeUtil.ValidatedPriceRange.Invalid) {
                return;
            }
            if (validatedPriceRangeComponent1 != PriceRangeUtil.ValidatedPriceRange.WithinRange) {
                PriceOutOfRangeBottomSheet priceOutOfRangeBottomSheet = new PriceOutOfRangeBottomSheet();
                priceOutOfRangeBottomSheet.OLrzqt = function1;
                priceOutOfRangeBottomSheet.AhwBna = function0;
                priceOutOfRangeBottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("price_out_of_range_input", priceOutOfRangeBottomSheetInput), C56390yDp.OLrzqt("validation_result", validatedPriceRangeComponent1), C56390yDp.OLrzqt("magnitude", strComponent2)));
                priceOutOfRangeBottomSheet.show(fragmentManager, Application.class.getSimpleName());
                return;
            }
            function02.invoke();
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.dHAKvv));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C48357uOm c48357uOmOLrzqt = C48357uOm.OLrzqt(LayoutInflater.from(requireContext()), constraintLayout, false);
        this.copydefault = c48357uOmOLrzqt;
        constraintLayout.addView(c48357uOmOLrzqt != null ? c48357uOmOLrzqt.getRoot() : null);
        super.onCreateContent(constraintLayout);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C48357uOm c48357uOm = this.copydefault;
        if (c48357uOm != null) {
            OKReminder oKReminder = c48357uOm.AEQbTJ;
            PriceRangeUtil.ValidatedPriceRange validatedPriceRangeCopydefault = copydefault();
            Intrinsics.copydefault(validatedPriceRangeCopydefault);
            int i = Activity.EZpvd[validatedPriceRangeCopydefault.ordinal()];
            int i2 = 2;
            if (i != 1 && i != 2) {
                i2 = 0;
            }
            oKReminder.setStyle(i2);
            c48357uOm.AEQbTJ.setCloseIconVisibility(false);
            OKReminder oKReminder2 = c48357uOm.AEQbTJ;
            PriceRangeUtil.ValidatedPriceRange validatedPriceRangeCopydefault2 = copydefault();
            Intrinsics.copydefault(validatedPriceRangeCopydefault2);
            oKReminder2.setMessage(copydefault(validatedPriceRangeCopydefault2));
            TextView textView = c48357uOm.copydefault;
            PriceOutOfRangeBottomSheetInput priceOutOfRangeBottomSheetInputEZpvd = EZpvd();
            Intrinsics.copydefault(priceOutOfRangeBottomSheetInputEZpvd);
            textView.setText(pTB.formatLocalized$default(priceOutOfRangeBottomSheetInputEZpvd.KWHzl(), null, 1, null));
            PriceOutOfRangeBottomSheetInput priceOutOfRangeBottomSheetInputEZpvd2 = EZpvd();
            Intrinsics.copydefault(priceOutOfRangeBottomSheetInputEZpvd2);
            String localized$default = pTB.formatLocalized$default(priceOutOfRangeBottomSheetInputEZpvd2.OLrzqt(), null, 1, null);
            PriceOutOfRangeBottomSheetInput priceOutOfRangeBottomSheetInputEZpvd3 = EZpvd();
            Intrinsics.copydefault(priceOutOfRangeBottomSheetInputEZpvd3);
            c48357uOm.KWHzl.setText(copydefault(localized$default, pTB.formatLocalized$default(priceOutOfRangeBottomSheetInputEZpvd3.AEQbTJ(), null, 1, null)));
        }
    }

    public final String copydefault(PriceRangeUtil.ValidatedPriceRange validatedPriceRange) {
        int i = Activity.EZpvd[validatedPriceRange.ordinal()];
        if (i == 1) {
            int i2 = C55688xof.Application.MediaMetadataCompat1;
            String strKWHzl = KWHzl();
            Intrinsics.copydefault((Object) strKWHzl);
            return C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("times", pTB.formatICUNumber$default(C33129mqd.EZpvd(strKWHzl), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null))));
        }
        if (i != 2) {
            return (i == 3 || i == 4) ? C33070mpX.AYXKKw(C55688xof.Application.scaleBitmap) : "";
        }
        int i3 = C55688xof.Application.putText;
        String strKWHzl2 = KWHzl();
        Intrinsics.copydefault((Object) strKWHzl2);
        return C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", pTB.formatICUPercent$default(C33129mqd.EZpvd(strKWHzl2), null, C38307pTy.Companion.AEQbTJ(2), null, Double.valueOf(100.0d), null, 21, null))));
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ PriceOutOfRangeBottomSheet OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, PriceOutOfRangeBottomSheet priceOutOfRangeBottomSheet) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = priceOutOfRangeBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ PriceOutOfRangeBottomSheet EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, PriceOutOfRangeBottomSheet priceOutOfRangeBottomSheet) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = priceOutOfRangeBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.OLrzqt;
                if (function1 != null) {
                    PriceRangeUtil.ValidatedPriceRange validatedPriceRangeCopydefault = this.EZpvd.copydefault();
                    Intrinsics.copydefault(validatedPriceRangeCopydefault);
                    function1.invoke(validatedPriceRangeCopydefault);
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.getSystemFallbackPickeractivity_release));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C55688xof.Application.getString));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new StateListAnimator(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.copydefault = null;
        this.OLrzqt = null;
        this.AhwBna = null;
        super.onDestroyView();
    }

    public static final class PriceOutOfRangeBottomSheetInput implements Parcelable {
        public static final Parcelable.Creator<PriceOutOfRangeBottomSheetInput> CREATOR = new Creator();
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<PriceOutOfRangeBottomSheetInput> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PriceOutOfRangeBottomSheetInput createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PriceOutOfRangeBottomSheetInput(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PriceOutOfRangeBottomSheetInput[] newArray(int i) {
                return new PriceOutOfRangeBottomSheetInput[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PriceOutOfRangeBottomSheetInput copy$default(PriceOutOfRangeBottomSheetInput priceOutOfRangeBottomSheetInput, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = priceOutOfRangeBottomSheetInput.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = priceOutOfRangeBottomSheetInput.copydefault;
            }
            if ((i & 4) != 0) {
                str3 = priceOutOfRangeBottomSheetInput.KWHzl;
            }
            if ((i & 8) != 0) {
                str4 = priceOutOfRangeBottomSheetInput.EZpvd;
            }
            return priceOutOfRangeBottomSheetInput.copydefault(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PriceOutOfRangeBottomSheetInput copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new PriceOutOfRangeBottomSheetInput(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.EZpvd;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceOutOfRangeBottomSheetInput)) {
                return false;
            }
            PriceOutOfRangeBottomSheetInput priceOutOfRangeBottomSheetInput = (PriceOutOfRangeBottomSheetInput) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) priceOutOfRangeBottomSheetInput.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) priceOutOfRangeBottomSheetInput.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) priceOutOfRangeBottomSheetInput.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) priceOutOfRangeBottomSheetInput.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PriceOutOfRangeBottomSheetInput(currentPrice=" + this.OLrzqt + ", lowerLimitPrice=" + this.copydefault + ", upperLimitPrice=" + this.KWHzl + ", symbol=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.EZpvd);
        }

        public PriceOutOfRangeBottomSheetInput(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.OLrzqt = str;
            this.copydefault = str2;
            this.KWHzl = str3;
            this.EZpvd = str4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SpannedString copydefault(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        PriceRangeUtil.ValidatedPriceRange validatedPriceRangeCopydefault = copydefault();
        Intrinsics.copydefault(validatedPriceRangeCopydefault);
        int i = Activity.EZpvd[validatedPriceRangeCopydefault.ordinal()];
        if (i == 1) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) " - ");
            spannableStringBuilder.append((CharSequence) str2);
        } else if (i == 2) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) " - ");
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        } else if (i != 3) {
            if (i != 4) {
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append((CharSequence) " - ");
                spannableStringBuilder.append((CharSequence) str2);
            }
        }
        spannableStringBuilder.append((CharSequence) " ");
        PriceOutOfRangeBottomSheetInput priceOutOfRangeBottomSheetInputEZpvd = EZpvd();
        Intrinsics.copydefault(priceOutOfRangeBottomSheetInputEZpvd);
        spannableStringBuilder.append((CharSequence) priceOutOfRangeBottomSheetInputEZpvd.copydefault());
        return new SpannedString(spannableStringBuilder);
    }
}
