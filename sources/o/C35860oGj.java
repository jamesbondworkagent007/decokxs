package o;

import com.okinc.im.bean.IMRelationInfo;
import com.okinc.im.bean.RelationModel;
import com.okinc.im.usecase.relationlist.GetIMRelationListByUidsUseCase$invoke$1;
import com.okinc.okimcore.model.im.CacheStrategy;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35860oGj {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC44177sGd EZpvd;

    @yCM
    public C35860oGj(@NotNull InterfaceC44177sGd interfaceC44177sGd) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        this.EZpvd = interfaceC44177sGd;
    }

    /* JADX INFO: renamed from: o.oGj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.util.List<RelationModel> list, @NotNull CacheStrategy cacheStrategy, @NotNull Continuation<? super java.util.List<IMRelationInfo>> continuation) throws java.lang.Throwable {
        GetIMRelationListByUidsUseCase$invoke$1 getIMRelationListByUidsUseCase$invoke$1;
        java.util.Map map;
        if (continuation instanceof GetIMRelationListByUidsUseCase$invoke$1) {
            getIMRelationListByUidsUseCase$invoke$1 = (GetIMRelationListByUidsUseCase$invoke$1) continuation;
            int i = getIMRelationListByUidsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getIMRelationListByUidsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getIMRelationListByUidsUseCase$invoke$1 = new GetIMRelationListByUidsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getIMRelationListByUidsUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getIMRelationListByUidsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (list.isEmpty()) {
                return yDY.AhwBna();
            }
            pUU.KWHzl("GetIMRelationListByUidsUseCase", "Get IM relation list with cacheStrategy:" + cacheStrategy + ", relationIdList:" + list);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (RelationModel relationModel : list) {
                linkedHashMap.put(relationModel.getUserUid(), relationModel.getKycName());
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((RelationModel) it.next()).getUserUid());
            }
            InterfaceC44177sGd interfaceC44177sGd = this.EZpvd;
            getIMRelationListByUidsUseCase$invoke$1.L$0 = linkedHashMap;
            getIMRelationListByUidsUseCase$invoke$1.label = 1;
            objCopydefault = interfaceC44177sGd.copydefault(arrayList, cacheStrategy, getIMRelationListByUidsUseCase$invoke$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            map = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (java.util.Map) getIMRelationListByUidsUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.lang.Iterable<RelationInfo> iterable = (java.lang.Iterable) objCopydefault;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        for (RelationInfo relationInfo : iterable) {
            arrayList2.add(C35667nzg.EZpvd.OLrzqt(relationInfo, (java.lang.String) map.get(relationInfo.getContactsId())));
        }
        pUU.AEQbTJ("Get IM relation list result size: " + arrayList2.size());
        return arrayList2;
    }

    public static /* synthetic */ java.lang.Object invoke$default(C35860oGj c35860oGj, java.util.List list, CacheStrategy cacheStrategy, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            cacheStrategy = CacheStrategy.CacheFirst;
        }
        return c35860oGj.KWHzl(list, cacheStrategy, continuation);
    }
}
