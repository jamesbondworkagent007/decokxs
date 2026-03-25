package o;

import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import com.welie.blessed.WriteType;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57089ybo implements InterfaceC57036yao {
    public static C57098ybx EZpvd;
    public boolean AYXKKw;
    public java.lang.String gEmmrt;
    public C58160yvz valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final C57099yby AhwBna = new C57099yby();
    public static final C57095ybu copydefault = new C57095ybu();
    public static int OLrzqt = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull C58160yvz c58160yvz) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        this.valueOf = c58160yvz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58160yvz valueOf() {
        return this.valueOf;
    }

    public C57089ybo(@NotNull C58160yvz c58160yvz, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c58160yvz, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = c58160yvz;
        this.gEmmrt = str;
    }

    /* JADX INFO: renamed from: o.ybo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ybo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final int copydefault() {
            return C57089ybo.OLrzqt;
        }

        public final void copydefault(int i) {
            C57089ybo.OLrzqt = i;
        }

        public final void copydefault(@NotNull C58160yvz c58160yvz, @NotNull byte[] bArr, @NotNull java.lang.String str, @NotNull Function1<? super byte[], Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            if (copydefault() == -1) {
                function12.invoke(LedgerError.MTU_NOT_RESPONSE);
            } else if (C57089ybo.EZpvd != null) {
                function12.invoke(LedgerError.APDU_ORDER_BREAK);
            } else {
                C57089ybo.EZpvd = new C57098ybx(c58160yvz, bArr, str, function1, function12);
                AEQbTJ();
            }
        }

        public final void AEQbTJ() {
            WriteType writeType;
            C57098ybx c57098ybx = C57089ybo.EZpvd;
            if (c57098ybx == null) {
                return;
            }
            java.lang.String strKWHzl = c57098ybx.KWHzl();
            boolean zGEmmrt = C59449zhJ.gEmmrt(strKWHzl, "13D63400-2C97-0004-0000-4C6564676572", true);
            boolean zGEmmrt2 = C59449zhJ.gEmmrt(strKWHzl, "13d63400-2c97-3004-0000-4c6564676572", true);
            if (!zGEmmrt && !zGEmmrt2) {
                c57098ybx.copydefault().invoke(LedgerError.DEVICE_DISCONNECT);
                TaskDescription taskDescription = C57089ybo.Companion;
                C57089ybo.EZpvd = null;
                return;
            }
            android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristicOLrzqt = c57098ybx.OLrzqt().OLrzqt(UUID.fromString(strKWHzl), UUID.fromString(zGEmmrt ? "13d63400-2c97-0004-0003-4c6564676572" : "13d63400-2c97-3004-0003-4c6564676572"));
            if (bluetoothGattCharacteristicOLrzqt != null) {
                writeType = WriteType.WITHOUT_RESPONSE;
            } else {
                bluetoothGattCharacteristicOLrzqt = c57098ybx.OLrzqt().OLrzqt(UUID.fromString(strKWHzl), UUID.fromString(zGEmmrt ? "13d63400-2c97-0004-0002-4c6564676572" : "13d63400-2c97-3004-0002-4c6564676572"));
                if (bluetoothGattCharacteristicOLrzqt == null) {
                    c57098ybx.copydefault().invoke(LedgerError.DEVICE_DISCONNECT);
                    TaskDescription taskDescription2 = C57089ybo.Companion;
                    C57089ybo.EZpvd = null;
                    return;
                }
                writeType = WriteType.WITH_RESPONSE;
            }
            java.util.Iterator<T> it = C57089ybo.AhwBna.KWHzl(c57098ybx.AEQbTJ(), copydefault()).iterator();
            while (it.hasNext()) {
                c57098ybx.OLrzqt().EZpvd(bluetoothGattCharacteristicOLrzqt, ((C57093ybs) it.next()).copydefault(), writeType);
            }
        }

        public final void KWHzl(@NotNull byte[] bArr) {
            java.lang.String strCopydefault;
            Intrinsics.checkNotNullParameter(bArr, "");
            C57098ybx c57098ybx = C57089ybo.EZpvd;
            if (c57098ybx == null || (strCopydefault = C57089ybo.copydefault.copydefault(bArr)) == null) {
                return;
            }
            c57098ybx.EZpvd().invoke(C57137ycj.copydefault.EZpvd(strCopydefault));
            TaskDescription taskDescription = C57089ybo.Companion;
            C57089ybo.EZpvd = null;
        }

        public final void OLrzqt() {
            C57098ybx c57098ybx = C57089ybo.EZpvd;
            if (c57098ybx == null) {
                return;
            }
            c57098ybx.copydefault().invoke(LedgerError.DEVICE_DISCONNECT);
            TaskDescription taskDescription = C57089ybo.Companion;
            C57089ybo.EZpvd = null;
        }

        public final void KWHzl() {
            AEQbTJ();
        }
    }

    @Override // o.InterfaceC57036yao
    public BluetoothDeviceModel OLrzqt() {
        java.lang.String strDbNXlk = this.valueOf.DbNXlk();
        java.lang.String strAkhnZx = this.valueOf.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(strAkhnZx, "");
        return new BluetoothDeviceModel(strDbNXlk, strAkhnZx, this.gEmmrt);
    }

    @Override // o.InterfaceC57036yao
    public void EZpvd(@NotNull final Function2<? super java.lang.String, ? super java.lang.String, Unit> function2, @NotNull final Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        KWHzl(C57137ycj.copydefault.EZpvd("b001000000"), new Function1() { // from class: o.ybn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57089ybo.EZpvd(function1, function2, (byte[]) obj);
            }
        }, function1);
    }

    public static final Unit EZpvd(Function1 function1, Function2 function2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr[0] != 1) {
            function1.invoke(LedgerError.APDU_ORDER_BREAK);
            return Unit.INSTANCE;
        }
        int iEZpvd = C56395yDu.EZpvd(bArr[1]);
        int i = iEZpvd + 2;
        int i2 = iEZpvd + 3;
        function2.invoke(yDV.joinToString$default(yDT.AEQbTJ(bArr, 2, i), (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new Function1() { // from class: o.ybk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57089ybo.copydefault(((java.lang.Byte) obj).byteValue());
            }
        }, 30, (java.lang.Object) null), yDV.joinToString$default(yDT.AEQbTJ(bArr, i2, C56395yDu.EZpvd(bArr[i]) + i2), (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new Function1() { // from class: o.ybl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57089ybo.OLrzqt(((java.lang.Byte) obj).byteValue());
            }
        }, 30, (java.lang.Object) null));
        return Unit.INSTANCE;
    }

    public static final java.lang.CharSequence copydefault(byte b) {
        return java.lang.String.valueOf((char) C56395yDu.EZpvd(b));
    }

    public static final java.lang.CharSequence OLrzqt(byte b) {
        return java.lang.String.valueOf((char) C56395yDu.EZpvd(b));
    }

    @Override // o.InterfaceC57036yao
    public void KWHzl(@NotNull byte[] bArr, @NotNull Function1<? super byte[], Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        if (this.AYXKKw) {
            function12.invoke(LedgerError.DEVICE_DISCONNECT);
        } else {
            Companion.copydefault(this.valueOf, bArr, this.gEmmrt, function1, function12);
        }
    }
}
