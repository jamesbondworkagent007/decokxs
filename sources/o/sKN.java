package o;

import com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sKN {
    java.lang.Object AEQbTJ(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super java.util.List<PhoneRelationGroup>> continuation);

    void AEQbTJ(@NotNull java.util.List<InHouseIMContactInfoEntity> list);

    java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<PhoneRelationGroup>> continuation);

    Job EZpvd();

    Flow<java.util.List<PhoneRelationGroup>> KWHzl(@NotNull java.util.Set<java.lang.String> set);

    Flow<java.util.List<PhoneRelationGroup>> OLrzqt(int i, boolean z);

    java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation);

    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar {
        public static /* synthetic */ Flow getRandomPhoneRelationGroupsNoOkxRelationAsFlow$default(sKN skn, int i, boolean z, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRandomPhoneRelationGroupsNoOkxRelationAsFlow");
            }
            if ((i2 & 2) != 0) {
                z = true;
            }
            return skn.OLrzqt(i, z);
        }
    }
}
