package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.net.bean.BackupCloudTypeRes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fIG extends AbstractC33073mpa {
    public final C13934dbu EZpvd = new C13934dbu();
    public final MutableLiveData<java.lang.Integer> copydefault = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Integer> copydefault() {
        return this.copydefault;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(this.EZpvd.EZpvd("", str), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.fIH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fIG.AEQbTJ(this.AEQbTJ, (BackupCloudTypeRes) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fIK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fIG.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fII
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fIG.AEQbTJ(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fIL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fIG.EZpvd(function12, obj);
            }
        }));
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(fIG fig, BackupCloudTypeRes backupCloudTypeRes) {
        fig.copydefault.setValue(java.lang.Integer.valueOf(backupCloudTypeRes.getBackupCloudType()));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(fIG fig, java.lang.Throwable th) {
        fig.copydefault.setValue(-1);
        return Unit.INSTANCE;
    }
}
