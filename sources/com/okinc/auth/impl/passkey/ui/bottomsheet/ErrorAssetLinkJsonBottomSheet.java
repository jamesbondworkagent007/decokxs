package com.okinc.auth.impl.passkey.ui.bottomsheet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewParent;
import android.widget.Checkable;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.auth.impl.passkey.ui.bottomsheet.ErrorAssetLinkJsonBottomSheet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C52781wYc;
import o.C52794wYp;
import o.C55296xhK;
import o.C56390yDp;
import o.C56392yDr;
import o.C5639aAK;
import o.C8206ayP;
import o.C8259azP;
import o.InterfaceC56387yDm;
import o.wXX;
import o.wYF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class ErrorAssetLinkJsonBottomSheet extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.aIb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ErrorAssetLinkJsonBottomSheet.EZpvd(this.AEQbTJ);
        }
    });
    public Function0<Unit> OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    public static abstract class ErrorAssetLinkJsonType implements Parcelable {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.bottomsheet.ErrorAssetLinkJsonBottomSheet.ErrorAssetLinkJsonType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ErrorAssetLinkJsonType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ErrorAssetLinkJsonType() {
        }

        public static final class Register extends ErrorAssetLinkJsonType {
            public static final Register EZpvd = new Register();
            public static final Parcelable.Creator<Register> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Register> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Register createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Register.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Register[] newArray(int i) {
                    return new Register[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private Register() {
                super(null);
            }
        }

        public static final class Authenticate extends ErrorAssetLinkJsonType {
            public static final Parcelable.Creator<Authenticate> CREATOR = new Creator();
            public final boolean AEQbTJ;

            public static final class Creator implements Parcelable.Creator<Authenticate> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Authenticate createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new Authenticate(parcel.readInt() != 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Authenticate[] newArray(int i) {
                    return new Authenticate[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Authenticate copy$default(Authenticate authenticate, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = authenticate.AEQbTJ;
                }
                return authenticate.copydefault(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Authenticate copydefault(boolean z) {
                return new Authenticate(z);
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
                return (obj instanceof Authenticate) && this.AEQbTJ == ((Authenticate) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Authenticate(supportRemovePasskey=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(this.AEQbTJ ? 1 : 0);
            }

            public Authenticate(boolean z) {
                super(null);
                this.AEQbTJ = z;
            }
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.bottomsheet.ErrorAssetLinkJsonBottomSheet.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ErrorAssetLinkJsonBottomSheet EZpvd(@NotNull ErrorAssetLinkJsonType errorAssetLinkJsonType) {
            Intrinsics.checkNotNullParameter(errorAssetLinkJsonType, "");
            ErrorAssetLinkJsonBottomSheet errorAssetLinkJsonBottomSheet = new ErrorAssetLinkJsonBottomSheet();
            errorAssetLinkJsonBottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_ERROR_ASSET_LINK_JSON_TYPE", errorAssetLinkJsonType)));
            return errorAssetLinkJsonBottomSheet;
        }
    }

    public final ErrorAssetLinkJsonType OLrzqt() {
        return (ErrorAssetLinkJsonType) this.AEQbTJ.getValue();
    }

    public static final ErrorAssetLinkJsonType EZpvd(ErrorAssetLinkJsonBottomSheet errorAssetLinkJsonBottomSheet) {
        ErrorAssetLinkJsonType errorAssetLinkJsonType;
        Bundle arguments = errorAssetLinkJsonBottomSheet.getArguments();
        return (arguments == null || (errorAssetLinkJsonType = (ErrorAssetLinkJsonType) arguments.getParcelable("KEY_ERROR_ASSET_LINK_JSON_TYPE")) == null) ? ErrorAssetLinkJsonType.Register.EZpvd : errorAssetLinkJsonType;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C8259azP c8259azPEZpvd = C8259azP.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        ViewParent parent = c8259azPEZpvd.copydefault.AEQbTJ().getParent();
        RelativeLayout relativeLayout = parent instanceof RelativeLayout ? (RelativeLayout) parent : null;
        int i = 8;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        c8259azPEZpvd.copydefault.AEQbTJ().setVisibility(8);
        c8259azPEZpvd.copydefault.setType(0);
        c8259azPEZpvd.copydefault.setStatus(5);
        ErrorAssetLinkJsonType errorAssetLinkJsonTypeOLrzqt = OLrzqt();
        ErrorAssetLinkJsonType.Register register = ErrorAssetLinkJsonType.Register.EZpvd;
        if (Intrinsics.EZpvd(errorAssetLinkJsonTypeOLrzqt, register)) {
            c8259azPEZpvd.copydefault.setTitleText(C33070mpX.AYXKKw(C8206ayP.Dialog.fERRXa));
        } else {
            if (!(errorAssetLinkJsonTypeOLrzqt instanceof ErrorAssetLinkJsonType.Authenticate)) {
                throw new NoWhenBranchMatchedException();
            }
            c8259azPEZpvd.copydefault.setTitleText(C33070mpX.AYXKKw(C8206ayP.Dialog.fjfviF));
        }
        C5639aAK c5639aAKKWHzl = C5639aAK.KWHzl(getLayoutInflater(), constraintLayout, false);
        ErrorAssetLinkJsonType errorAssetLinkJsonTypeOLrzqt2 = OLrzqt();
        if (Intrinsics.EZpvd(errorAssetLinkJsonTypeOLrzqt2, register)) {
            c5639aAKKWHzl.KWHzl.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.USBtdM));
            c5639aAKKWHzl.OLrzqt.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.fdOvFl));
        } else {
            if (!(errorAssetLinkJsonTypeOLrzqt2 instanceof ErrorAssetLinkJsonType.Authenticate)) {
                throw new NoWhenBranchMatchedException();
            }
            c5639aAKKWHzl.KWHzl.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.aUsmxb));
            c5639aAKKWHzl.OLrzqt.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.igXuih));
        }
        c8259azPEZpvd.copydefault.setAdvancedView(c5639aAKKWHzl.getRoot());
        wYF wyfOLrzqt = c8259azPEZpvd.copydefault.OLrzqt();
        C52794wYp c52794wYpCopydefault = wyfOLrzqt.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.QwvEab));
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyfOLrzqt.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            ErrorAssetLinkJsonType errorAssetLinkJsonTypeOLrzqt3 = OLrzqt();
            if (!Intrinsics.EZpvd(errorAssetLinkJsonTypeOLrzqt3, register)) {
                if (!(errorAssetLinkJsonTypeOLrzqt3 instanceof ErrorAssetLinkJsonType.Authenticate)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((ErrorAssetLinkJsonType.Authenticate) errorAssetLinkJsonTypeOLrzqt3).OLrzqt()) {
                    i = 0;
                }
            }
            c52794wYpAEQbTJ.setVisibility(i);
            c52794wYpAEQbTJ.setOKDSType(258);
            c52794wYpAEQbTJ.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.dUDNAs));
            c52794wYpAEQbTJ.setOnClickListener(new Application(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ErrorAssetLinkJsonBottomSheet AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, ErrorAssetLinkJsonBottomSheet errorAssetLinkJsonBottomSheet) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = errorAssetLinkJsonBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
                Function0<Unit> function0Copydefault = this.AEQbTJ.copydefault();
                if (function0Copydefault != null) {
                    function0Copydefault.invoke();
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ ErrorAssetLinkJsonBottomSheet OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, ErrorAssetLinkJsonBottomSheet errorAssetLinkJsonBottomSheet) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = errorAssetLinkJsonBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
                Function0<Unit> function0KWHzl = this.OLrzqt.KWHzl();
                if (function0KWHzl != null) {
                    function0KWHzl.invoke();
                }
            }
        }
    }
}
