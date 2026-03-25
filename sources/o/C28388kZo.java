package o;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.GetCollectionGroupUseCase$invoke$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28388kZo {
    public final kYA EZpvd;
    public final kKG OLrzqt;

    public C28388kZo(@NotNull kYA kya, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(kya, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.EZpvd = kya;
        this.OLrzqt = kkg;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[PHI: r10
  0x0084: PHI (r10v9 java.lang.Object) = (r10v8 java.lang.Object), (r10v1 java.lang.Object) binds: [B:27:0x0081, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[PHI: r10
  0x00ac: PHI (r10v13 java.lang.Object) = (r10v12 java.lang.Object), (r10v1 java.lang.Object) binds: [B:35:0x00a9, B:14:0x002f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(boolean z, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CommonGroupData>, OKServerException>> continuation) throws java.lang.Throwable {
        GetCollectionGroupUseCase$invoke$1 getCollectionGroupUseCase$invoke$1;
        kYA kya;
        C28388kZo c28388kZo;
        kYA kya2;
        C28388kZo c28388kZo2;
        if (continuation instanceof GetCollectionGroupUseCase$invoke$1) {
            getCollectionGroupUseCase$invoke$1 = (GetCollectionGroupUseCase$invoke$1) continuation;
            int i = getCollectionGroupUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCollectionGroupUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getCollectionGroupUseCase$invoke$1 = new GetCollectionGroupUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getCollectionGroupUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getCollectionGroupUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kya2 = (kYA) getCollectionGroupUseCase$invoke$1.L$1;
                c28388kZo2 = (C28388kZo) getCollectionGroupUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                java.lang.String strCopydefault = c28388kZo2.OLrzqt.copydefault();
                getCollectionGroupUseCase$invoke$1.L$0 = null;
                getCollectionGroupUseCase$invoke$1.L$1 = null;
                getCollectionGroupUseCase$invoke$1.label = 2;
                objAEQbTJ = kya2.KWHzl((java.lang.String) objAEQbTJ, strCopydefault, getCollectionGroupUseCase$invoke$1);
                return objAEQbTJ != objCopydefault ? objCopydefault : objAEQbTJ;
            }
            if (i2 == 2) {
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kya = (kYA) getCollectionGroupUseCase$invoke$1.L$1;
            c28388kZo = (C28388kZo) getCollectionGroupUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            java.lang.String strCopydefault2 = c28388kZo.OLrzqt.copydefault();
            getCollectionGroupUseCase$invoke$1.L$0 = null;
            getCollectionGroupUseCase$invoke$1.L$1 = null;
            getCollectionGroupUseCase$invoke$1.label = 4;
            objAEQbTJ = kya.EZpvd((java.lang.String) objAEQbTJ, strCopydefault2, getCollectionGroupUseCase$invoke$1);
            return objAEQbTJ != objCopydefault ? objCopydefault : objAEQbTJ;
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        if (z) {
            kya2 = this.EZpvd;
            kKG kkg = this.OLrzqt;
            getCollectionGroupUseCase$invoke$1.L$0 = this;
            getCollectionGroupUseCase$invoke$1.L$1 = kya2;
            getCollectionGroupUseCase$invoke$1.label = 1;
            objAEQbTJ = kkg.AEQbTJ(getCollectionGroupUseCase$invoke$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c28388kZo2 = this;
            java.lang.String strCopydefault3 = c28388kZo2.OLrzqt.copydefault();
            getCollectionGroupUseCase$invoke$1.L$0 = null;
            getCollectionGroupUseCase$invoke$1.L$1 = null;
            getCollectionGroupUseCase$invoke$1.label = 2;
            objAEQbTJ = kya2.KWHzl((java.lang.String) objAEQbTJ, strCopydefault3, getCollectionGroupUseCase$invoke$1);
            if (objAEQbTJ != objCopydefault) {
            }
        } else {
            kya = this.EZpvd;
            kKG kkg2 = this.OLrzqt;
            getCollectionGroupUseCase$invoke$1.L$0 = this;
            getCollectionGroupUseCase$invoke$1.L$1 = kya;
            getCollectionGroupUseCase$invoke$1.label = 3;
            objAEQbTJ = kkg2.AEQbTJ(getCollectionGroupUseCase$invoke$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c28388kZo = this;
            java.lang.String strCopydefault22 = c28388kZo.OLrzqt.copydefault();
            getCollectionGroupUseCase$invoke$1.L$0 = null;
            getCollectionGroupUseCase$invoke$1.L$1 = null;
            getCollectionGroupUseCase$invoke$1.label = 4;
            objAEQbTJ = kya.EZpvd((java.lang.String) objAEQbTJ, strCopydefault22, getCollectionGroupUseCase$invoke$1);
            if (objAEQbTJ != objCopydefault) {
            }
        }
    }
}
