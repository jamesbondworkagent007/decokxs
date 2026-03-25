package o;

import androidx.lifecycle.ViewModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.ghk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20484ghk extends ViewModel {
    public Function1<? super AbstractC20481ghh<?>, Unit> KWHzl;
    public java.util.List<? extends BaseModel<?>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel<?>>, java.util.List<com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel<?>> */
    public final java.util.List<BaseModel<?>> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.util.List<? extends BaseModel<?>> list) {
        this.copydefault = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super AbstractC20481ghh<?>, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.ghh<?>, kotlin.Unit>, kotlin.jvm.functions.Function1<o.ghh<?>, kotlin.Unit> */
    public final Function1<AbstractC20481ghh<?>, Unit> copydefault() {
        return this.KWHzl;
    }
}
