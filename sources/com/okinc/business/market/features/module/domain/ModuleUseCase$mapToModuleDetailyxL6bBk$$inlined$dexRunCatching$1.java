package com.okinc.business.market.features.module.domain;

import com.okinc.business.dexlogic.bean.ShareLinkVO;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.ModuleDetailData;
import com.okinc.business.market.data.model.ModuleTokenData;
import com.okinc.business.market.features.module.domain.type.TimeType;
import com.okinc.business.market.features.tag.domain.CompactTag;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C28896kjS;
import o.C28899kjV;
import o.C28902kjY;
import o.C29712kyn;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.module.domain.ModuleUseCase$mapToModuleDetail-yxL6bBk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class ModuleUseCase$mapToModuleDetailyxL6bBk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C28899kjV>>, Object> {
    final /* synthetic */ List $chainList$inlined;
    final /* synthetic */ String $competitionDeeplink$inlined;
    final /* synthetic */ ModuleDetailData $from$inlined;
    final /* synthetic */ List $listedTokenData$inlined;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$19;
    Object L$2;
    Object L$20;
    Object L$21;
    Object L$22;
    Object L$23;
    Object L$24;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ C28896kjS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleUseCase$mapToModuleDetailyxL6bBk$$inlined$dexRunCatching$1(Continuation continuation, ModuleDetailData moduleDetailData, List list, String str, List list2, C28896kjS c28896kjS) {
        super(2, continuation);
        this.$from$inlined = moduleDetailData;
        this.$listedTokenData$inlined = list;
        this.$competitionDeeplink$inlined = str;
        this.$chainList$inlined = list2;
        this.this$0 = c28896kjS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModuleUseCase$mapToModuleDetailyxL6bBk$$inlined$dexRunCatching$1(continuation, this.$from$inlined, this.$listedTokenData$inlined, this.$competitionDeeplink$inlined, this.$chainList$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C28899kjV>> continuation) {
        return ((ModuleUseCase$mapToModuleDetailyxL6bBk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:95:0x0253) to fix multi-entry loop: BACK_EDGE: B:95:0x0253 -> B:96:0x0292 */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0292, code lost:
    
        r21 = r21.getT();
        r32 = r0;
        r35 = r1;
        r36 = r2;
        r2 = r10;
        r1 = r12;
        r0 = r13;
        r10 = r14;
        r12 = r15;
        r33 = r19;
        r34 = r20;
        r13 = r22;
        r37 = r23;
        r38 = r24;
        r39 = r25;
        r19 = r26;
        r40 = r27;
        r41 = r28;
        r42 = r29;
        r43 = r30;
        r20 = new java.util.ArrayList();
        r15 = r50;
        r14 = r3;
        r31 = r4;
        r4 = r8;
        r8 = r21.iterator();
        r3 = r9;
        r9 = r14;
        r46 = r7;
        r7 = r5;
        r5 = r46;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03a8 A[Catch: all -> 0x0550, CancellationException -> 0x0567, TryCatch #2 {CancellationException -> 0x0567, all -> 0x0550, blocks: (B:7:0x004c, B:127:0x04d0, B:131:0x04db, B:133:0x051a, B:137:0x0535, B:141:0x0542, B:12:0x00e7, B:102:0x0395, B:106:0x03a2, B:108:0x03a8, B:96:0x0292, B:98:0x0298, B:110:0x03bb, B:52:0x01c0, B:54:0x01c6, B:57:0x01d6, B:58:0x01dc, B:60:0x01e2, B:65:0x0206, B:67:0x020a, B:71:0x0213, B:74:0x021b, B:77:0x0223, B:80:0x022b, B:83:0x0233, B:86:0x023b, B:89:0x0243, B:92:0x024b, B:95:0x0253, B:111:0x042b, B:114:0x043d, B:115:0x0442, B:118:0x044b, B:123:0x0466, B:15:0x012e, B:22:0x0142, B:25:0x014b, B:28:0x0154, B:31:0x015d, B:34:0x0166, B:37:0x016f, B:40:0x0179, B:43:0x0182, B:46:0x018b, B:49:0x01a2, B:51:0x01aa, B:18:0x0139), top: B:149:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03bb A[Catch: all -> 0x0550, CancellationException -> 0x0567, TryCatch #2 {CancellationException -> 0x0567, all -> 0x0550, blocks: (B:7:0x004c, B:127:0x04d0, B:131:0x04db, B:133:0x051a, B:137:0x0535, B:141:0x0542, B:12:0x00e7, B:102:0x0395, B:106:0x03a2, B:108:0x03a8, B:96:0x0292, B:98:0x0298, B:110:0x03bb, B:52:0x01c0, B:54:0x01c6, B:57:0x01d6, B:58:0x01dc, B:60:0x01e2, B:65:0x0206, B:67:0x020a, B:71:0x0213, B:74:0x021b, B:77:0x0223, B:80:0x022b, B:83:0x0233, B:86:0x023b, B:89:0x0243, B:92:0x024b, B:95:0x0253, B:111:0x042b, B:114:0x043d, B:115:0x0442, B:118:0x044b, B:123:0x0466, B:15:0x012e, B:22:0x0142, B:25:0x014b, B:28:0x0154, B:31:0x015d, B:34:0x0166, B:37:0x016f, B:40:0x0179, B:43:0x0182, B:46:0x018b, B:49:0x01a2, B:51:0x01aa, B:18:0x0139), top: B:149:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x042b A[Catch: all -> 0x0550, CancellationException -> 0x0567, TryCatch #2 {CancellationException -> 0x0567, all -> 0x0550, blocks: (B:7:0x004c, B:127:0x04d0, B:131:0x04db, B:133:0x051a, B:137:0x0535, B:141:0x0542, B:12:0x00e7, B:102:0x0395, B:106:0x03a2, B:108:0x03a8, B:96:0x0292, B:98:0x0298, B:110:0x03bb, B:52:0x01c0, B:54:0x01c6, B:57:0x01d6, B:58:0x01dc, B:60:0x01e2, B:65:0x0206, B:67:0x020a, B:71:0x0213, B:74:0x021b, B:77:0x0223, B:80:0x022b, B:83:0x0233, B:86:0x023b, B:89:0x0243, B:92:0x024b, B:95:0x0253, B:111:0x042b, B:114:0x043d, B:115:0x0442, B:118:0x044b, B:123:0x0466, B:15:0x012e, B:22:0x0142, B:25:0x014b, B:28:0x0154, B:31:0x015d, B:34:0x0166, B:37:0x016f, B:40:0x0179, B:43:0x0182, B:46:0x018b, B:49:0x01a2, B:51:0x01aa, B:18:0x0139), top: B:149:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x043d A[Catch: all -> 0x0550, CancellationException -> 0x0567, TryCatch #2 {CancellationException -> 0x0567, all -> 0x0550, blocks: (B:7:0x004c, B:127:0x04d0, B:131:0x04db, B:133:0x051a, B:137:0x0535, B:141:0x0542, B:12:0x00e7, B:102:0x0395, B:106:0x03a2, B:108:0x03a8, B:96:0x0292, B:98:0x0298, B:110:0x03bb, B:52:0x01c0, B:54:0x01c6, B:57:0x01d6, B:58:0x01dc, B:60:0x01e2, B:65:0x0206, B:67:0x020a, B:71:0x0213, B:74:0x021b, B:77:0x0223, B:80:0x022b, B:83:0x0233, B:86:0x023b, B:89:0x0243, B:92:0x024b, B:95:0x0253, B:111:0x042b, B:114:0x043d, B:115:0x0442, B:118:0x044b, B:123:0x0466, B:15:0x012e, B:22:0x0142, B:25:0x014b, B:28:0x0154, B:31:0x015d, B:34:0x0166, B:37:0x016f, B:40:0x0179, B:43:0x0182, B:46:0x018b, B:49:0x01a2, B:51:0x01aa, B:18:0x0139), top: B:149:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0466 A[Catch: all -> 0x0550, CancellationException -> 0x0567, TryCatch #2 {CancellationException -> 0x0567, all -> 0x0550, blocks: (B:7:0x004c, B:127:0x04d0, B:131:0x04db, B:133:0x051a, B:137:0x0535, B:141:0x0542, B:12:0x00e7, B:102:0x0395, B:106:0x03a2, B:108:0x03a8, B:96:0x0292, B:98:0x0298, B:110:0x03bb, B:52:0x01c0, B:54:0x01c6, B:57:0x01d6, B:58:0x01dc, B:60:0x01e2, B:65:0x0206, B:67:0x020a, B:71:0x0213, B:74:0x021b, B:77:0x0223, B:80:0x022b, B:83:0x0233, B:86:0x023b, B:89:0x0243, B:92:0x024b, B:95:0x0253, B:111:0x042b, B:114:0x043d, B:115:0x0442, B:118:0x044b, B:123:0x0466, B:15:0x012e, B:22:0x0142, B:25:0x014b, B:28:0x0154, B:31:0x015d, B:34:0x0166, B:37:0x016f, B:40:0x0179, B:43:0x0182, B:46:0x018b, B:49:0x01a2, B:51:0x01aa, B:18:0x0139), top: B:149:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c6 A[Catch: all -> 0x0550, CancellationException -> 0x0567, TryCatch #2 {CancellationException -> 0x0567, all -> 0x0550, blocks: (B:7:0x004c, B:127:0x04d0, B:131:0x04db, B:133:0x051a, B:137:0x0535, B:141:0x0542, B:12:0x00e7, B:102:0x0395, B:106:0x03a2, B:108:0x03a8, B:96:0x0292, B:98:0x0298, B:110:0x03bb, B:52:0x01c0, B:54:0x01c6, B:57:0x01d6, B:58:0x01dc, B:60:0x01e2, B:65:0x0206, B:67:0x020a, B:71:0x0213, B:74:0x021b, B:77:0x0223, B:80:0x022b, B:83:0x0233, B:86:0x023b, B:89:0x0243, B:92:0x024b, B:95:0x0253, B:111:0x042b, B:114:0x043d, B:115:0x0442, B:118:0x044b, B:123:0x0466, B:15:0x012e, B:22:0x0142, B:25:0x014b, B:28:0x0154, B:31:0x015d, B:34:0x0166, B:37:0x016f, B:40:0x0179, B:43:0x0182, B:46:0x018b, B:49:0x01a2, B:51:0x01aa, B:18:0x0139), top: B:149:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0298 A[Catch: all -> 0x0550, CancellationException -> 0x0567, TryCatch #2 {CancellationException -> 0x0567, all -> 0x0550, blocks: (B:7:0x004c, B:127:0x04d0, B:131:0x04db, B:133:0x051a, B:137:0x0535, B:141:0x0542, B:12:0x00e7, B:102:0x0395, B:106:0x03a2, B:108:0x03a8, B:96:0x0292, B:98:0x0298, B:110:0x03bb, B:52:0x01c0, B:54:0x01c6, B:57:0x01d6, B:58:0x01dc, B:60:0x01e2, B:65:0x0206, B:67:0x020a, B:71:0x0213, B:74:0x021b, B:77:0x0223, B:80:0x022b, B:83:0x0233, B:86:0x023b, B:89:0x0243, B:92:0x024b, B:95:0x0253, B:111:0x042b, B:114:0x043d, B:115:0x0442, B:118:0x044b, B:123:0x0466, B:15:0x012e, B:22:0x0142, B:25:0x014b, B:28:0x0154, B:31:0x015d, B:34:0x0166, B:37:0x016f, B:40:0x0179, B:43:0x0182, B:46:0x018b, B:49:0x01a2, B:51:0x01aa, B:18:0x0139), top: B:149:0x0010 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0367 -> B:102:0x0395). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String moduleName;
        String moduleDescription;
        String moduleAvgPriceChange;
        String moduleVolume;
        String moduleMarketCap;
        String moduleTotalTokenNum;
        String moduleGainersProportion;
        String moduleLosersProportion;
        TimeType timeTypeEZpvd;
        String chainId;
        Object obj2;
        boolean z;
        int i;
        List listAhwBna;
        String str;
        String str2;
        Iterator it;
        Collection collection;
        int i2;
        String pushChannel;
        String str3;
        List list;
        ShareLinkVO shareLinkVO;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        TimeType timeType;
        String str11;
        String str12;
        TagWrapper tagWrapper;
        String str13;
        Object objM7386unboximpl;
        ShareLinkVO shareLinkVO2;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        TimeType timeType2;
        String str22;
        int i3;
        Object next;
        String str23;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = this.label;
        String str24 = "";
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            Integer descriptionHidden = this.$from$inlined.getDescriptionHidden();
            int i5 = (descriptionHidden != null && descriptionHidden.intValue() == 0) ? 1 : 0;
            moduleName = this.$from$inlined.getModuleName();
            if (moduleName == null) {
                moduleName = "--";
            }
            moduleDescription = this.$from$inlined.getModuleDescription();
            if (moduleDescription == null) {
                moduleDescription = "";
            }
            moduleAvgPriceChange = this.$from$inlined.getModuleAvgPriceChange();
            if (moduleAvgPriceChange == null) {
                moduleAvgPriceChange = "";
            }
            moduleVolume = this.$from$inlined.getModuleVolume();
            if (moduleVolume == null) {
                moduleVolume = "";
            }
            moduleMarketCap = this.$from$inlined.getModuleMarketCap();
            if (moduleMarketCap == null) {
                moduleMarketCap = "";
            }
            moduleTotalTokenNum = this.$from$inlined.getModuleTotalTokenNum();
            if (moduleTotalTokenNum == null) {
                moduleTotalTokenNum = "0";
            }
            moduleGainersProportion = this.$from$inlined.getModuleGainersProportion();
            if (moduleGainersProportion == null) {
                moduleGainersProportion = "";
            }
            moduleLosersProportion = this.$from$inlined.getModuleLosersProportion();
            if (moduleLosersProportion == null) {
                moduleLosersProportion = "";
            }
            timeTypeEZpvd = TimeType.Companion.EZpvd(this.$from$inlined.getTimeType());
            chainId = this.$from$inlined.getChainId();
            int i6 = i5;
            if (chainId == null) {
                chainId = "chain_id_all_network";
            }
            List<ModuleTokenData> tokenList = this.$from$inlined.getTokenList();
            if (tokenList != null) {
                str = "chain_id_all_network";
                str2 = "--";
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(tokenList, 10));
                it = tokenList.iterator();
                collection = arrayList;
                i2 = i6;
                if (it.hasNext()) {
                }
            } else {
                obj2 = objCopydefault;
                z = true;
                i = i6;
                listAhwBna = null;
                if (listAhwBna == null) {
                }
                pushChannel = this.$from$inlined.getPushChannel();
                if (pushChannel == null) {
                }
                ShareLinkVO shareLinkVO3 = this.$from$inlined.getShareLinkVO();
                Object obj3 = obj2;
                String tagKey = this.$from$inlined.getTagKey();
                if (!C33129mqd.OLrzqt((CharSequence) tagKey)) {
                }
                if (str3 != null) {
                }
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                shareLinkVO2 = (ShareLinkVO) this.L$12;
                str22 = (String) this.L$11;
                listAhwBna = (List) this.L$10;
                str14 = (String) this.L$9;
                str15 = (String) this.L$8;
                str16 = (String) this.L$7;
                str17 = (String) this.L$6;
                str18 = (String) this.L$5;
                str19 = (String) this.L$4;
                str20 = (String) this.L$3;
                str21 = (String) this.L$2;
                timeType2 = (TimeType) this.L$1;
                chainId = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                z = true;
                shareLinkVO = shareLinkVO2;
                str12 = str22;
                list = listAhwBna;
                str13 = str14;
                str4 = str15;
                str5 = str16;
                str6 = str17;
                str7 = str18;
                str8 = str19;
                str9 = str20;
                str10 = str21;
                timeType = timeType2;
                tagWrapper = (TagWrapper) (!Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
                str11 = chainId;
                objM7377constructorimpl = Result.m7377constructorimpl(new C28899kjV(i != 0 ? z : false, str13, str4, str5, str6, str7, str8, str9, str10, timeType, str11, list, str12, shareLinkVO, tagWrapper, this.$from$inlined.getModuleDarkBackgroundUrl(), this.$from$inlined.getModuleLightBackgroundUrl(), this.$from$inlined.isBoostModule() == StringBooleanType.TRUE ? z : false, this.$listedTokenData$inlined, this.$competitionDeeplink$inlined));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            int i7 = this.I$0;
            Iterator it2 = (Iterator) this.L$24;
            String str25 = (String) this.L$23;
            String str26 = (String) this.L$22;
            String str27 = (String) this.L$21;
            String str28 = (String) this.L$20;
            String str29 = (String) this.L$19;
            String str30 = (String) this.L$18;
            String str31 = (String) this.L$17;
            String str32 = (String) this.L$16;
            String str33 = (String) this.L$15;
            int i8 = i7;
            Collection collection2 = (Collection) this.L$14;
            String str34 = (String) this.L$13;
            Collection collection3 = (Collection) this.L$12;
            Iterator it3 = (Iterator) this.L$11;
            Collection collection4 = (Collection) this.L$10;
            String str35 = (String) this.L$9;
            String str36 = (String) this.L$8;
            String str37 = (String) this.L$7;
            String str38 = (String) this.L$6;
            String str39 = (String) this.L$5;
            String str40 = (String) this.L$4;
            String str41 = (String) this.L$3;
            String str42 = (String) this.L$2;
            TimeType timeType3 = (TimeType) this.L$1;
            String str43 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
            String str44 = "--";
            String str45 = str25;
            String str46 = str26;
            String str47 = str27;
            String str48 = str29;
            String str49 = str32;
            String str50 = str30;
            String str51 = str33;
            String str52 = str31;
            String str53 = str34;
            Collection collection5 = collection3;
            Iterator it4 = it3;
            String str54 = str35;
            moduleDescription = str36;
            String str55 = str39;
            String str56 = str42;
            TimeType timeType4 = timeType3;
            String str57 = str43;
            String str58 = "chain_id_all_network";
            Iterator it5 = it2;
            String str59 = str28;
            Collection collection6 = collection4;
            String str60 = str37;
            String str61 = str41;
            Object obj4 = objCopydefault;
            String str62 = "";
            Collection collection7 = collection2;
            String str63 = str38;
            if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                str23 = str61;
            } else {
                str23 = str61;
                objM7386unboximpl2 = null;
            }
            TagWrapper tagWrapper2 = (TagWrapper) objM7386unboximpl2;
            if (tagWrapper2 != null) {
                collection7.add(tagWrapper2);
            }
            Object obj5 = obj4;
            String str64 = str44;
            String str65 = str23;
            String str66 = str59;
            String str67 = str40;
            Collection arrayList2 = collection7;
            String str68 = str56;
            if (it5.hasNext()) {
                CompactTagData compactTagData = (CompactTagData) it5.next();
                Iterator it6 = it5;
                C29712kyn c29712kyn = this.this$0.EZpvd;
                this.L$0 = str57;
                this.L$1 = timeType4;
                this.L$2 = str68;
                this.L$3 = str65;
                this.L$4 = str67;
                this.L$5 = str55;
                this.L$6 = str63;
                this.L$7 = str60;
                this.L$8 = moduleDescription;
                this.L$9 = str54;
                this.L$10 = collection6;
                this.L$11 = it4;
                this.L$12 = collection5;
                this.L$13 = str53;
                TimeType timeType5 = timeType4;
                Collection collection8 = arrayList2;
                this.L$14 = collection8;
                String str69 = str51;
                this.L$15 = str69;
                String str70 = str49;
                this.L$16 = str70;
                String str71 = str52;
                this.L$17 = str71;
                String str72 = str50;
                this.L$18 = str72;
                String str73 = str48;
                this.L$19 = str73;
                String str74 = str66;
                this.L$20 = str74;
                String str75 = str47;
                this.L$21 = str75;
                String str76 = str46;
                this.L$22 = str76;
                String str77 = str45;
                this.L$23 = str77;
                String str78 = str54;
                this.L$24 = it6;
                Collection collection9 = collection6;
                int i9 = i8;
                this.I$0 = i9;
                this.label = 1;
                String str79 = str65;
                String str80 = str67;
                String str81 = str55;
                String str82 = str63;
                String str83 = str60;
                String str84 = moduleDescription;
                str59 = str74;
                Object objEZpvd = c29712kyn.EZpvd(compactTagData, (62 & 2) != 0 ? null : null, (62 & 4) != 0 ? null : null, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) != 0 ? null : null, this);
                obj4 = obj5;
                if (objEZpvd == obj4) {
                    return obj4;
                }
                str56 = str68;
                str63 = str82;
                collection7 = collection8;
                it5 = it6;
                str52 = str71;
                str44 = str64;
                str54 = str78;
                collection6 = collection9;
                str60 = str83;
                moduleDescription = str84;
                timeType4 = timeType5;
                i8 = i9;
                str55 = str81;
                objM7386unboximpl2 = objEZpvd;
                str51 = str69;
                str45 = str77;
                str46 = str76;
                str47 = str75;
                str48 = str73;
                str50 = str72;
                str61 = str79;
                str49 = str70;
                str40 = str80;
                if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                }
                TagWrapper tagWrapper22 = (TagWrapper) objM7386unboximpl2;
                if (tagWrapper22 != null) {
                }
                Object obj52 = obj4;
                String str642 = str44;
                String str652 = str23;
                String str662 = str59;
                String str672 = str40;
                Collection arrayList22 = collection7;
                String str682 = str56;
                if (it5.hasNext()) {
                    String str85 = str672;
                    String str86 = str55;
                    String str87 = str49;
                    String str88 = str652;
                    String str89 = str60;
                    int i10 = i8;
                    collection5.add(new C28902kjY(str53, str51, str45, str46, str47, str662, str48, str50, str52, str87, (List) arrayList22));
                    moduleLosersProportion = str682;
                    objCopydefault = obj52;
                    it = it4;
                    moduleVolume = str63;
                    str24 = str62;
                    str = str58;
                    str2 = str642;
                    moduleName = str54;
                    collection = collection6;
                    moduleAvgPriceChange = str89;
                    moduleDescription = moduleDescription;
                    timeTypeEZpvd = timeType4;
                    i2 = i10;
                    moduleTotalTokenNum = str85;
                    moduleMarketCap = str86;
                    chainId = str57;
                    moduleGainersProportion = str88;
                    if (it.hasNext()) {
                        int i11 = i2;
                        z = true;
                        obj2 = objCopydefault;
                        listAhwBna = (List) collection;
                        i = i11;
                        if (listAhwBna == null) {
                            listAhwBna = yDY.AhwBna();
                        }
                        pushChannel = this.$from$inlined.getPushChannel();
                        if (pushChannel == null) {
                            pushChannel = str24;
                        }
                        ShareLinkVO shareLinkVO32 = this.$from$inlined.getShareLinkVO();
                        Object obj32 = obj2;
                        String tagKey2 = this.$from$inlined.getTagKey();
                        str3 = !C33129mqd.OLrzqt((CharSequence) tagKey2) ? tagKey2 : null;
                        if (str3 != null) {
                            list = listAhwBna;
                            shareLinkVO = shareLinkVO32;
                            str4 = moduleDescription;
                            str5 = moduleAvgPriceChange;
                            str6 = moduleVolume;
                            str7 = moduleMarketCap;
                            str8 = moduleTotalTokenNum;
                            str9 = moduleGainersProportion;
                            str10 = moduleLosersProportion;
                            timeType = timeTypeEZpvd;
                            str11 = chainId;
                            str12 = pushChannel;
                            tagWrapper = null;
                            str13 = moduleName;
                            if (this.$from$inlined.isBoostModule() == StringBooleanType.TRUE) {
                            }
                            objM7377constructorimpl = Result.m7377constructorimpl(new C28899kjV(i != 0 ? z : false, str13, str4, str5, str6, str7, str8, str9, str10, timeType, str11, list, str12, shareLinkVO, tagWrapper, this.$from$inlined.getModuleDarkBackgroundUrl(), this.$from$inlined.getModuleLightBackgroundUrl(), this.$from$inlined.isBoostModule() == StringBooleanType.TRUE ? z : false, this.$listedTokenData$inlined, this.$competitionDeeplink$inlined));
                            return Result.m7376boximpl(objM7377constructorimpl);
                        }
                        C29712kyn c29712kyn2 = this.this$0.EZpvd;
                        CompactTag compactTag = new CompactTag(str3, false, null, 6, null);
                        this.L$0 = chainId;
                        this.L$1 = timeTypeEZpvd;
                        this.L$2 = moduleLosersProportion;
                        this.L$3 = moduleGainersProportion;
                        this.L$4 = moduleTotalTokenNum;
                        this.L$5 = moduleMarketCap;
                        this.L$6 = moduleVolume;
                        this.L$7 = moduleAvgPriceChange;
                        this.L$8 = moduleDescription;
                        this.L$9 = moduleName;
                        this.L$10 = listAhwBna;
                        this.L$11 = pushChannel;
                        this.L$12 = shareLinkVO32;
                        String str90 = pushChannel;
                        this.L$13 = null;
                        this.L$14 = null;
                        this.L$15 = null;
                        this.L$16 = null;
                        this.L$17 = null;
                        this.L$18 = null;
                        this.L$19 = null;
                        this.L$20 = null;
                        this.L$21 = null;
                        this.L$22 = null;
                        this.L$23 = null;
                        this.L$24 = null;
                        this.I$0 = i;
                        this.label = 2;
                        Object objAEQbTJ = c29712kyn2.AEQbTJ(compactTag, this);
                        if (objAEQbTJ == obj32) {
                            return obj32;
                        }
                        objM7386unboximpl = objAEQbTJ;
                        shareLinkVO2 = shareLinkVO32;
                        str14 = moduleName;
                        str15 = moduleDescription;
                        str16 = moduleAvgPriceChange;
                        str17 = moduleVolume;
                        str18 = moduleMarketCap;
                        str19 = moduleTotalTokenNum;
                        str20 = moduleGainersProportion;
                        str21 = moduleLosersProportion;
                        timeType2 = timeTypeEZpvd;
                        str22 = str90;
                        shareLinkVO = shareLinkVO2;
                        str12 = str22;
                        list = listAhwBna;
                        str13 = str14;
                        str4 = str15;
                        str5 = str16;
                        str6 = str17;
                        str7 = str18;
                        str8 = str19;
                        str9 = str20;
                        str10 = str21;
                        timeType = timeType2;
                        tagWrapper = (TagWrapper) (!Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
                        str11 = chainId;
                        if (this.$from$inlined.isBoostModule() == StringBooleanType.TRUE) {
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(new C28899kjV(i != 0 ? z : false, str13, str4, str5, str6, str7, str8, str9, str10, timeType, str11, list, str12, shareLinkVO, tagWrapper, this.$from$inlined.getModuleDarkBackgroundUrl(), this.$from$inlined.getModuleLightBackgroundUrl(), this.$from$inlined.isBoostModule() == StringBooleanType.TRUE ? z : false, this.$listedTokenData$inlined, this.$competitionDeeplink$inlined));
                        return Result.m7376boximpl(objM7377constructorimpl);
                    }
                    ModuleTokenData moduleTokenData = (ModuleTokenData) it.next();
                    String chainId2 = moduleTokenData.getChainId();
                    Iterator it7 = it;
                    if (chainId2 == null) {
                        chainId2 = str;
                    }
                    Iterator it8 = this.$chainList$inlined.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            i3 = i2;
                            next = null;
                            break;
                        }
                        next = it8.next();
                        Iterator it9 = it8;
                        i3 = i2;
                        if (Intrinsics.EZpvd((Object) moduleTokenData.getChainId(), (Object) ((MarketChainBean) next).getChainId())) {
                            break;
                        }
                        it8 = it9;
                        i2 = i3;
                    }
                    MarketChainBean marketChainBean = (MarketChainBean) next;
                    String chainLogo = marketChainBean != null ? marketChainBean.getChainLogo() : null;
                    if (chainLogo == null) {
                        chainLogo = str24;
                    }
                    String tokenSymbol = moduleTokenData.getTokenSymbol();
                    if (tokenSymbol == null) {
                        tokenSymbol = str2;
                    }
                    String tokenLogoUrl = moduleTokenData.getTokenLogoUrl();
                    if (tokenLogoUrl == null) {
                        tokenLogoUrl = str24;
                    }
                    String tokenAddress = moduleTokenData.getTokenAddress();
                    if (tokenAddress == null) {
                        tokenAddress = str24;
                    }
                    String tokenVolume = moduleTokenData.getTokenVolume();
                    if (tokenVolume == null) {
                        tokenVolume = str24;
                    }
                    String tokenMarketCap = moduleTokenData.getTokenMarketCap();
                    if (tokenMarketCap == null) {
                        tokenMarketCap = str24;
                    }
                    String tokenPriceChange = moduleTokenData.getTokenPriceChange();
                    if (tokenPriceChange == null) {
                        tokenPriceChange = str24;
                    }
                    String tokenPrice = moduleTokenData.getTokenPrice();
                    if (tokenPrice == null) {
                        tokenPrice = str24;
                    }
                    String tokenScoreRank = moduleTokenData.getTokenScoreRank();
                    if (tokenScoreRank == null) {
                        String str91 = str24;
                        List<CompactTagData> t = moduleTokenData.getT();
                        obj52 = objCopydefault;
                        str51 = chainLogo;
                        str45 = tokenSymbol;
                        str672 = moduleTotalTokenNum;
                        str652 = moduleGainersProportion;
                        str682 = moduleLosersProportion;
                        timeType4 = timeTypeEZpvd;
                        str57 = chainId;
                        str58 = str;
                        str642 = str2;
                        str53 = chainId2;
                        str46 = tokenLogoUrl;
                        str47 = tokenAddress;
                        str662 = tokenVolume;
                        i8 = i3;
                        str48 = tokenMarketCap;
                        str50 = tokenPriceChange;
                        str52 = tokenPrice;
                        str49 = str91;
                        arrayList22 = new ArrayList();
                        it4 = it7;
                        collection5 = collection;
                        str62 = str24;
                        str63 = moduleVolume;
                        it5 = t.iterator();
                        str55 = moduleMarketCap;
                        collection6 = collection5;
                        String str92 = moduleAvgPriceChange;
                        str54 = moduleName;
                        str60 = str92;
                    } else {
                        List<CompactTagData> t2 = moduleTokenData.getT();
                        obj52 = objCopydefault;
                        str51 = chainLogo;
                        str45 = tokenSymbol;
                        str672 = moduleTotalTokenNum;
                        str652 = moduleGainersProportion;
                        str682 = moduleLosersProportion;
                        timeType4 = timeTypeEZpvd;
                        str57 = chainId;
                        str58 = str;
                        str642 = str2;
                        str53 = chainId2;
                        str46 = tokenLogoUrl;
                        str47 = tokenAddress;
                        str662 = tokenVolume;
                        i8 = i3;
                        str48 = tokenMarketCap;
                        str50 = tokenPriceChange;
                        str52 = tokenPrice;
                        str49 = str91;
                        arrayList22 = new ArrayList();
                        it4 = it7;
                        collection5 = collection;
                        str62 = str24;
                        str63 = moduleVolume;
                        it5 = t2.iterator();
                        str55 = moduleMarketCap;
                        collection6 = collection5;
                        String str922 = moduleAvgPriceChange;
                        str54 = moduleName;
                        str60 = str922;
                    }
                    if (it5.hasNext()) {
                    }
                }
            }
        }
    }
}
