package o;

import com.google.gson.Gson;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.mln_ui.ui.okkit.UdMath;
import com.okinc.search.bean.SearchResultContentPo;
import java.util.Date;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGL implements InterfaceC49405unt<SearchResultContentPo, C39998qFo> {
    public final android.app.Application KWHzl;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @yCM
    public qGL(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.KWHzl = application;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qGL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C39998qFo AEQbTJ(@NotNull SearchResultContentPo searchResultContentPo) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(searchResultContentPo, "");
        boolean zAEQbTJ = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AEQbTJ(OKComplianceRestrictionService.Feature.CR_TWITTER);
        if (searchResultContentPo.getQueryInfo() == null || zAEQbTJ) {
            return null;
        }
        java.util.List<SearchResultContentPo.SearchResultContentItemPo> contentDataList = searchResultContentPo.getContentDataList();
        if (contentDataList != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(contentDataList, 10));
            java.util.Iterator<T> it = contentDataList.iterator();
            while (it.hasNext()) {
                arrayList3.add(OLrzqt((SearchResultContentPo.SearchResultContentItemPo) it.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        java.util.List<SearchResultContentPo.SearchResultContentKolPo> kolDataList = searchResultContentPo.getKolDataList();
        if (kolDataList != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(kolDataList, 10));
            java.util.Iterator<T> it2 = kolDataList.iterator();
            while (it2.hasNext()) {
                arrayList4.add(OLrzqt((SearchResultContentPo.SearchResultContentKolPo) it2.next()));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        java.util.List<InterfaceC40516qYt> listCopydefault = copydefault(arrayList2 == null ? yDY.AhwBna() : arrayList2, arrayList == null ? yDY.AhwBna() : arrayList);
        boolean z = (arrayList2 != null ? arrayList2.size() : 0) + (arrayList != null ? arrayList.size() : 0) > 4;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(new Gson().toJson(SearchResultContentPo.copy$default(searchResultContentPo, null, null, null, 3, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.lang.String str = (java.lang.String) objM7377constructorimpl;
        if (str == null) {
            return null;
        }
        return new C39998qFo(searchResultContentPo, str, arrayList, arrayList2, listCopydefault, z);
    }

    public final java.util.List<InterfaceC40516qYt> copydefault(java.util.List<C39997qFn> list, java.util.List<C39991qFh> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, list2.size() < 2 ? 4 - list2.size() : 2);
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list2, 4 - listAhwBna.size()));
    }

    public final C39991qFh OLrzqt(SearchResultContentPo.SearchResultContentItemPo searchResultContentItemPo) {
        SearchResultContentPo.SearchResultContentItemPo.ContentAuthorPo author = searchResultContentItemPo.getAuthor();
        java.lang.String strCopydefault = author != null ? author.copydefault() : null;
        SearchResultContentPo.SearchResultContentItemPo.ContentAuthorPo author2 = searchResultContentItemPo.getAuthor();
        java.lang.String strEZpvd = author2 != null ? author2.EZpvd() : null;
        java.lang.String strAEQbTJ = AEQbTJ(java.lang.Long.valueOf(searchResultContentItemPo.getPublishTime()));
        java.lang.String contentId = searchResultContentItemPo.getContentId();
        java.lang.String content = searchResultContentItemPo.getContent();
        boolean z = (C59449zhJ.gEmmrt(SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER, searchResultContentItemPo.getSourcePlatform(), true) || C59449zhJ.gEmmrt(SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_OKX, searchResultContentItemPo.getSourcePlatform(), true)) ? false : true;
        SearchResultContentPo.SearchResultContentItemPo.ContentAuthorPo author3 = searchResultContentItemPo.getAuthor();
        return new C39991qFh(strCopydefault, strEZpvd, strAEQbTJ, contentId, content, z, C33129mqd.OLrzqt((java.lang.Object) (author3 != null ? author3.KWHzl() : null), (java.lang.Object) 1), searchResultContentItemPo);
    }

    public final C39997qFn OLrzqt(SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPo) {
        java.lang.String numberKmb = UdMath.formatNumberKmb(java.lang.String.valueOf(searchResultContentKolPo.getFollowerCount()), 1, 2, 0, 0);
        java.lang.String kolId = searchResultContentKolPo.getKolId();
        java.lang.String nickName = searchResultContentKolPo.getNickName();
        java.lang.String portrait = searchResultContentKolPo.getPortrait();
        Intrinsics.copydefault((java.lang.Object) numberKmb);
        java.lang.String translatedBio = searchResultContentKolPo.getTranslatedBio();
        java.lang.String bio = (translatedBio == null || translatedBio.length() == 0) ? searchResultContentKolPo.getBio() : searchResultContentKolPo.getTranslatedBio();
        if (bio == null) {
            bio = "";
        }
        return new C39997qFn(kolId, nickName, portrait, numberKmb, bio, C33129mqd.OLrzqt((java.lang.Object) searchResultContentKolPo.getOfficialStatus(), (java.lang.Object) 1), searchResultContentKolPo);
    }

    public final java.lang.String AEQbTJ(java.lang.Long l) {
        if (l == null) {
            return "";
        }
        int iCurrentTimeMillis = (int) ((java.lang.System.currentTimeMillis() - l.longValue()) / ((long) 1000));
        if (iCurrentTimeMillis < 0) {
            iCurrentTimeMillis = 0;
        }
        if (iCurrentTimeMillis < 60) {
            return C33069mpW.KWHzl(this.KWHzl, qZH.PendingIntent.OHqIaq, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCurrentTimeMillis))));
        }
        if (iCurrentTimeMillis < 3600) {
            return C33069mpW.KWHzl(this.KWHzl, qZH.PendingIntent.hrNTAI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCurrentTimeMillis / 60))));
        }
        if (iCurrentTimeMillis < 86400) {
            return C33069mpW.KWHzl(this.KWHzl, qZH.PendingIntent.dmfpNf, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCurrentTimeMillis / IMarketApiService.SIXTY_MINUTES))));
        }
        if (iCurrentTimeMillis < 604800) {
            return C33069mpW.KWHzl(this.KWHzl, qZH.PendingIntent.gwTjWJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCurrentTimeMillis / RemoteMessageConst.DEFAULT_TTL))));
        }
        return pTA.formatSimpleDateTime$default(new Date(l.longValue()), null, 1, null);
    }

    public C39998qFo KWHzl(@NotNull SearchResultContentPo searchResultContentPo) {
        Intrinsics.checkNotNullParameter(searchResultContentPo, "");
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((C39998qFo) InterfaceC49405unt.Activity.EZpvd(this, searchResultContentPo), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - java.lang.System.currentTimeMillis()));
        C40375qTn.AEQbTJ.copydefault("ConvertContentToVoUseCase", "toContentVos [cost: " + pairOLrzqt.getSecond() + "ms]");
        return (C39998qFo) pairOLrzqt.component1();
    }
}
