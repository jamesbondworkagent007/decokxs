package com.okinc.okimcore.feature.contact.repository.remote.inhouseim;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.AddContactReq;
import com.okinc.okimcore.model.remote.BlockContactReq;
import com.okinc.okimcore.model.remote.InhouseIMQueryMyQRCodeResponse;
import com.okinc.okimcore.model.remote.InhouseIMQueryQRCodeScanResponse;
import com.okinc.okimcore.model.remote.InitContactReq;
import com.okinc.okimcore.model.remote.ReferralTasks;
import com.okinc.okimcore.model.remote.RelationListRequest;
import com.okinc.okimcore.model.remote.RemoveContactReq;
import com.okinc.okimcore.model.remote.ScanQRCodeRequestBody;
import com.okinc.okimcore.model.remote.SearchContactReq;
import com.okinc.okimcore.model.remote.SearchContactReqV2;
import com.okinc.okimcore.model.remote.SetContactRemarkReq;
import com.okinc.okimcore.model.remote.SyncRelationsRequest;
import com.okinc.okimcore.model.remote.SyncRelationsResponse;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.sEJ;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMRelationService {
    @POST("/priapi/v1/im/relation/v1/add")
    Object addRelation(@Body @NotNull AddContactReq addContactReq, @NotNull Continuation<? super ResponseData<String>> continuation);

    @POST("/priapi/v1/im/contact/v1/block")
    Object blockContact(@Body @NotNull BlockContactReq blockContactReq, @NotNull Continuation<? super ResponseData<Boolean>> continuation);

    @GET("/priapi/v1/im/relation/v1/blocklist")
    Object getBlockedContactList(@NotNull Continuation<? super ResponseData<List<InHouseIMContactInfoEntity>>> continuation);

    @GET("/priapi/v1/im/qrcode/v2/retrieve")
    Object getMyQRCode(@NotNull Continuation<? super ResponseData<InhouseIMQueryMyQRCodeResponse>> continuation);

    @POST("/priapi/v1/im/qrcode/v1/scan")
    Object getQRCodeScanResult(@Body @NotNull ScanQRCodeRequestBody scanQRCodeRequestBody, @NotNull Continuation<? super ResponseData<InhouseIMQueryQRCodeScanResponse>> continuation);

    @POST("/priapi/v1/im/qrcode/v2/scan")
    Object getQRCodeScanResultV2(@Body @NotNull ScanQRCodeRequestBody scanQRCodeRequestBody, @NotNull Continuation<? super ResponseData<InhouseIMQueryQRCodeScanResponse>> continuation);

    @GET("/priapi/v1/im/relation/v1/referral-tasks")
    Object getReferralTasks(@NotNull Continuation<? super ResponseData<ReferralTasks>> continuation);

    @GET("/priapi/v1/im/relation/v1/info")
    Object getRelationById(@NotNull @Query("contactUid") String str, @Query("memberOfGroup") String str2, @NotNull Continuation<? super ResponseData<InHouseIMContactInfoEntity>> continuation);

    @GET("/priapi/v1/im/relation/v1/list")
    Object getRelationList(@Query("excludeRelationTypes") List<Integer> list, @NotNull Continuation<? super ResponseData<List<InHouseIMContactInfoEntity>>> continuation);

    @POST("/priapi/v1/im/relation/v1/query")
    Object getRelationListByRelationId(@Body @NotNull RelationListRequest relationListRequest, @NotNull Continuation<? super ResponseData<List<InHouseIMContactInfoEntity>>> continuation);

    @GET("/priapi/v1/im/relation/v1/list-with-remarks")
    Object getRelationListWithRemarks(@Query("excludeRelationTypes") List<Integer> list, @NotNull Continuation<? super ResponseData<List<InHouseIMContactInfoEntity>>> continuation);

    @GET("/priapi/v1/im/relation/v2/suggestions")
    Object getSuggestedList(@Header("Cache-Strategy") String str, @Header("Cache-Expire") long j, @Query("size") Integer num, @NotNull Continuation<? super ResponseData<List<InHouseIMContactInfoEntity>>> continuation);

    @POST("/priapi/v1/im/relation/v1/init")
    Object initRelation(@Body @NotNull InitContactReq initContactReq, @NotNull Continuation<? super ResponseData<InHouseIMContactInfoEntity>> continuation);

    @POST("/priapi/v1/im/relation/v1/remove")
    Object removeRelation(@Body @NotNull RemoveContactReq removeContactReq, @NotNull Continuation<? super ResponseData<String>> continuation);

    @POST("/priapi/v1/im/relation/v1/search")
    Object searchRelationById(@Body @NotNull SearchContactReq searchContactReq, @NotNull Continuation<? super ResponseData<List<InHouseIMContactInfoEntity>>> continuation);

    @POST("/priapi/v1/im/relation/v2/search")
    Object searchRelationV2(@Body @NotNull SearchContactReqV2 searchContactReqV2, @NotNull Continuation<? super ResponseData<List<InHouseIMContactInfoEntity>>> continuation);

    @POST("/priapi/v1/im/relation/v1/set-remark")
    Object setRelationRemark(@Body @NotNull SetContactRemarkReq setContactRemarkReq, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/im/relation/v1/sync")
    Object syncRelations(@Body @NotNull SyncRelationsRequest syncRelationsRequest, @NotNull Continuation<? super ResponseData<SyncRelationsResponse>> continuation);

    public static final class TaskDescription {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.contact.repository.remote.inhouseim.InHouseIMRelationService */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getRelationList$default(InHouseIMRelationService inHouseIMRelationService, List list, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRelationList");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return inHouseIMRelationService.getRelationList(list, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.contact.repository.remote.inhouseim.InHouseIMRelationService */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getRelationListWithRemarks$default(InHouseIMRelationService inHouseIMRelationService, List list, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRelationListWithRemarks");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return inHouseIMRelationService.getRelationListWithRemarks(list, continuation);
        }

        public static /* synthetic */ Object getSuggestedList$default(InHouseIMRelationService inHouseIMRelationService, String str, long j, Integer num, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSuggestedList");
            }
            String str2 = (i & 1) != 0 ? null : str;
            if ((i & 2) != 0) {
                j = sEJ.KWHzl.EZpvd();
            }
            return inHouseIMRelationService.getSuggestedList(str2, j, (i & 4) != 0 ? null : num, continuation);
        }
    }
}
