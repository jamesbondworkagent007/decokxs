package o;

import com.okinc.market.search.features.navigation.category.data.NavCategoryChoosePo;
import com.okinc.market.search.features.navigation.category.data.NavCategoryChooseRepository$getNavCategoryChooseData$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qJh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40099qJh {
    public final CoroutineDispatcher KWHzl;
    public final C40098qJg OLrzqt;

    @yCM
    public C40099qJh(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40098qJg c40098qJg) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40098qJg, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = c40098qJg;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super NavCategoryChoosePo> continuation) throws java.lang.Throwable {
        NavCategoryChooseRepository$getNavCategoryChooseData$1 navCategoryChooseRepository$getNavCategoryChooseData$1;
        if (continuation instanceof NavCategoryChooseRepository$getNavCategoryChooseData$1) {
            navCategoryChooseRepository$getNavCategoryChooseData$1 = (NavCategoryChooseRepository$getNavCategoryChooseData$1) continuation;
            int i = navCategoryChooseRepository$getNavCategoryChooseData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                navCategoryChooseRepository$getNavCategoryChooseData$1.label = i - Integer.MIN_VALUE;
            } else {
                navCategoryChooseRepository$getNavCategoryChooseData$1 = new NavCategoryChooseRepository$getNavCategoryChooseData$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = navCategoryChooseRepository$getNavCategoryChooseData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = navCategoryChooseRepository$getNavCategoryChooseData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C40098qJg c40098qJg = this.OLrzqt;
            navCategoryChooseRepository$getNavCategoryChooseData$1.label = 1;
            objKWHzl = c40098qJg.KWHzl(str, navCategoryChooseRepository$getNavCategoryChooseData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return ((ResponseData) objKWHzl).getData();
    }
}
