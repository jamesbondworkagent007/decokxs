package com.okinc.business.market.features.position.ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.market.features.position.ui.widget.BalanceInfoBottomSheet;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C21493hBk;
import o.C23274hvD;
import o.C24290iaz;
import o.C29157koO;
import o.C29158koP;
import o.C33070mpX;
import o.C52794wYp;
import o.C55298xhM;
import o.C56392yDr;
import o.C56403yEb;
import o.InterfaceC56387yDm;
import o.kMM;
import o.wXQ;
import o.wXX;
import o.wYF;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BalanceInfoBottomSheet extends wXX {
    public static final Companion Companion = new Companion(null);
    public static final int OLrzqt = 8;
    public C21493hBk EZpvd;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.koy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return BalanceInfoBottomSheet.KWHzl(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.kox
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return BalanceInfoBottomSheet.AEQbTJ();
        }
    });
    public final boolean copydefault = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.copydefault;
    }

    public final List<Companion.PositionContent> KWHzl() {
        return (List) this.AEQbTJ.getValue();
    }

    public static final List KWHzl(BalanceInfoBottomSheet balanceInfoBottomSheet) {
        ArrayList parcelableArrayList;
        Bundle arguments = balanceInfoBottomSheet.getArguments();
        return (arguments == null || (parcelableArrayList = BundleCompat.getParcelableArrayList(arguments, "content-list", Companion.PositionContent.class)) == null) ? yDY.AhwBna() : parcelableArrayList;
    }

    private final kMM copydefault() {
        return (kMM) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kMM AEQbTJ() {
        kMM kmm = new kMM();
        kmm.register(C29158koP.class, new C29157koO());
        return kmm;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setDividerVisibility(false);
        wxq.valueOf().setVisibility(8);
        wxq.EZpvd().setVisibility(8);
        wxq.AEQbTJ().setVisibility(0);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kMM.setData$default(o.kMM, java.util.List, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C21493hBk c21493hBkOLrzqt = C21493hBk.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        this.EZpvd = c21493hBkOLrzqt;
        if (c21493hBkOLrzqt != null) {
            if (KWHzl().isEmpty()) {
                dismissAllowingStateLoss();
            }
            c21493hBkOLrzqt.OLrzqt.setLayoutManager(new LinearLayoutManager(getContext()));
            c21493hBkOLrzqt.OLrzqt.addItemDecoration(new C24290iaz(C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null), false, 2, null));
            c21493hBkOLrzqt.OLrzqt.setAdapter(copydefault());
            kMM kmmCopydefault = copydefault();
            List<Companion.PositionContent> listKWHzl = KWHzl();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            for (Companion.PositionContent positionContent : listKWHzl) {
                arrayList.add(new C29158koP(positionContent.KWHzl(), positionContent.OLrzqt()));
            }
            kMM.setData$default(kmmCopydefault, arrayList, null, 2, null);
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.buildRccMetadata));
        wyf.setSecondaryButton(null);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.koz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    BalanceInfoBottomSheet.AEQbTJ(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void AEQbTJ(BalanceInfoBottomSheet balanceInfoBottomSheet, View view) {
        balanceInfoBottomSheet.dismissAllowingStateLoss();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.position.ui.widget.BalanceInfoBottomSheet.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static final class PositionContent implements Parcelable {
            public static final Parcelable.Creator<PositionContent> CREATOR = new Creator();
            public final String EZpvd;
            public final String copydefault;

            public static final class Creator implements Parcelable.Creator<PositionContent> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PositionContent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new PositionContent(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PositionContent[] newArray(int i) {
                    return new PositionContent[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ PositionContent copy$default(PositionContent positionContent, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = positionContent.copydefault;
                }
                if ((i & 2) != 0) {
                    str2 = positionContent.EZpvd;
                }
                return positionContent.EZpvd(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PositionContent EZpvd(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new PositionContent(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
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
                if (!(obj instanceof PositionContent)) {
                    return false;
                }
                PositionContent positionContent = (PositionContent) obj;
                return Intrinsics.EZpvd((Object) this.copydefault, (Object) positionContent.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) positionContent.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "PositionContent(title=" + this.copydefault + ", subtitle=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.copydefault);
                parcel.writeString(this.EZpvd);
            }

            public PositionContent(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.copydefault = str;
                this.EZpvd = str2;
            }
        }

        public final BalanceInfoBottomSheet KWHzl(@NotNull List<PositionContent> list) {
            Intrinsics.checkNotNullParameter(list, "");
            BalanceInfoBottomSheet balanceInfoBottomSheet = new BalanceInfoBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("content-list", new ArrayList<>(list));
            balanceInfoBottomSheet.setArguments(bundle);
            return balanceInfoBottomSheet;
        }
    }
}
