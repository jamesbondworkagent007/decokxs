package o;

import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import com.okinc.okimcore.model.remote.AddContactReq;
import com.okinc.okimcore.model.remote.BlockContactReq;
import com.okinc.okimcore.model.remote.InhouseIMQueryMyQRCodeResponse;
import com.okinc.okimcore.model.remote.InhouseIMQueryQRCodeScanResponse;
import com.okinc.okimcore.model.remote.InitContactReq;
import com.okinc.okimcore.model.remote.ReferralTasks;
import com.okinc.okimcore.model.remote.RemoveContactReq;
import com.okinc.okimcore.model.remote.ScanQRCodeRequestBody;
import com.okinc.okimcore.model.remote.SearchContactReqV2;
import com.okinc.okimcore.model.remote.SetContactRemarkReq;
import com.okinc.okimcore.model.room.inhouseim.ContactWithPhoneData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sGe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44178sGe {
    java.lang.Object AEQbTJ(java.util.List<? extends ContactRelationType> list, @NotNull Continuation<? super java.util.List<ContactWithPhoneData>> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super InhouseIMQueryMyQRCodeResponse> continuation);

    java.lang.Object EZpvd(@NotNull AddContactReq addContactReq, @NotNull Continuation<? super java.lang.String> continuation);

    java.lang.Object EZpvd(@NotNull BlockContactReq blockContactReq, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull RemoveContactReq removeContactReq, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull SetContactRemarkReq setContactRemarkReq, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super ContactWithPhoneData> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, java.lang.String str2, @NotNull Continuation<? super ContactWithPhoneData> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<ContactWithPhoneData>> continuation);

    Flow<ContactWithPhoneData> EZpvd(@NotNull java.lang.String str);

    java.lang.Object KWHzl(@NotNull CacheStrategy cacheStrategy, int i, @NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation);

    java.lang.Object KWHzl(@NotNull InitContactReq initContactReq, @NotNull Continuation<? super InHouseIMContactInfoEntity> continuation);

    java.lang.Object KWHzl(@NotNull ScanQRCodeRequestBody scanQRCodeRequestBody, @NotNull Continuation<? super InhouseIMQueryQRCodeScanResponse> continuation);

    java.lang.Object KWHzl(@NotNull SearchContactReqV2 searchContactReqV2, @NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation);

    java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<ContactWithPhoneData>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super ReferralTasks> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<ContactWithPhoneData>> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<ContactWithPhoneData>> continuation);

    java.lang.Object copydefault(@NotNull ScanQRCodeRequestBody scanQRCodeRequestBody, @NotNull Continuation<? super InhouseIMQueryQRCodeScanResponse> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super ContactWithPhoneData> continuation);

    java.lang.Object copydefault(java.util.List<? extends ContactRelationType> list, @NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation);

    /* JADX INFO: renamed from: o.sGe$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object getContactById$default(InterfaceC44178sGe interfaceC44178sGe, java.lang.String str, boolean z, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContactById");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC44178sGe.EZpvd(str, z, str2, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sGe */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object getRelationList$default(InterfaceC44178sGe interfaceC44178sGe, java.util.List list, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRelationList");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return interfaceC44178sGe.AEQbTJ(list, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sGe */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object getRelationsWithRemarkNames$default(InterfaceC44178sGe interfaceC44178sGe, java.util.List list, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRelationsWithRemarkNames");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return interfaceC44178sGe.copydefault((java.util.List<? extends ContactRelationType>) list, (Continuation<? super java.util.List<InHouseIMContactInfoEntity>>) continuation);
        }
    }
}
