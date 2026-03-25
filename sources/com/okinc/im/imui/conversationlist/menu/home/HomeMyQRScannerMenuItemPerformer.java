package com.okinc.im.imui.conversationlist.menu.home;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.qrcode.decode.ScanType;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.menu.IMMenuItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C35399nuc;
import o.C43251rlk;
import o.C52761wXj;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class HomeMyQRScannerMenuItemPerformer implements IMenuItemPerformer {
    public static final Parcelable.Creator<HomeMyQRScannerMenuItemPerformer> CREATOR = new Creator();
    public final boolean KWHzl;

    public static final class Creator implements Parcelable.Creator<HomeMyQRScannerMenuItemPerformer> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeMyQRScannerMenuItemPerformer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HomeMyQRScannerMenuItemPerformer(parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeMyQRScannerMenuItemPerformer[] newArray(int i) {
            return new HomeMyQRScannerMenuItemPerformer[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeMyQRScannerMenuItemPerformer() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.KWHzl ? 1 : 0);
    }

    public HomeMyQRScannerMenuItemPerformer(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:18) call: com.okinc.im.imui.conversationlist.menu.home.HomeMyQRScannerMenuItemPerformer.<init>(boolean):void type: THIS */
    public /* synthetic */ HomeMyQRScannerMenuItemPerformer(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public CharSequence EZpvd() {
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.fkESqH);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public Drawable copydefault() {
        Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.compare);
        if (drawableKWHzl == null) {
            return null;
        }
        drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        return drawableKWHzl;
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public void AEQbTJ(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.KWHzl) {
            if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fJNWhG()) {
                ScannerActivity.Activity.start$default(ScannerActivity.Companion, context, ScanType.Companion.copydefault(), null, 4, null);
            } else {
                ScannerActivity.Activity.start$default(ScannerActivity.Companion, context, ScanType.Companion.KWHzl(), null, 4, null);
            }
        }
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public IMMenuItem AEQbTJ() {
        return IMMenuItem.SCAN;
    }
}
