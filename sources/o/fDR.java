package o;

import com.okinc.business.defi.biz.net.bean.DeriveItem;
import com.okinc.business.defi.wallet.mine.walletmanage.mpcusecase.MpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fDR implements fDT {
    public final fDZ AEQbTJ;
    public final java.util.HashSet<java.lang.String> OLrzqt;
    public final java.util.HashMap<java.lang.String, java.lang.Integer> copydefault;

    public fDR(@NotNull CoroutineScope coroutineScope, @NotNull fDZ fdz) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(fdz, "");
        this.AEQbTJ = fdz;
        this.OLrzqt = new java.util.HashSet<>();
        this.copydefault = new java.util.HashMap<>();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r1v0 kotlinx.coroutines.CoroutineScope)
  (wrap:o.fDZ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fDZ:0x000e: CONSTRUCTOR 
  (wrap:o.dbu:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:11) call: o.dbu.<init>():void type: CONSTRUCTOR)
  (r1v0 kotlinx.coroutines.CoroutineScope)
 A[MD:(o.dbu, kotlinx.coroutines.CoroutineScope):void (m), WRAPPED] (LINE:10) call: o.fDX.<init>(o.dbu, kotlinx.coroutines.CoroutineScope):void type: CONSTRUCTOR) : (r2v0 o.fDZ))
 A[MD:(kotlinx.coroutines.CoroutineScope, o.fDZ):void (m)] (LINE:8) call: o.fDR.<init>(kotlinx.coroutines.CoroutineScope, o.fDZ):void type: THIS */
    public /* synthetic */ fDR(CoroutineScope coroutineScope, fDZ fdz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (i & 2) != 0 ? new fDX(new C13934dbu(), coroutineScope) : fdz);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.fDT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.HashMap<java.lang.String, java.lang.Integer>> continuation) throws java.lang.Throwable {
        MpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1 mpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1;
        fDR fdr;
        if (continuation instanceof MpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1) {
            mpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1 = (MpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1) continuation;
            int i = mpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1.label = i - Integer.MIN_VALUE;
            } else {
                mpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1 = new MpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = mpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!this.OLrzqt.contains((java.lang.String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return this.copydefault;
            }
            fDZ fdz = this.AEQbTJ;
            mpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1.L$0 = this;
            mpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1.label = 1;
            objOLrzqt = fdz.OLrzqt(arrayList, mpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            fdr = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fdr = (fDR) mpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        for (DeriveItem deriveItem : (java.util.List) objOLrzqt) {
            fdr.OLrzqt.add(deriveItem.getMpcId());
            fdr.copydefault.put(deriveItem.getMpcId(), C56443yFo.AEQbTJ(deriveItem.getDeriveIndex()));
        }
        return fdr.copydefault;
    }
}
