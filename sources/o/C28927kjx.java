package o;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.SocialMediaData;
import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.meme.data.model.XPostType;
import com.okinc.business.market.features.meme.domain.model.AiSheetExtras;
import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import com.okinc.business.market.features.meme.domain.model.DiscordMedia;
import com.okinc.business.market.features.meme.domain.model.FacebookMedia;
import com.okinc.business.market.features.meme.domain.model.Media;
import com.okinc.business.market.features.meme.domain.model.MemeCarSharingData;
import com.okinc.business.market.features.meme.domain.model.MemeCarSharingType;
import com.okinc.business.market.features.meme.domain.model.MemeProtocolUiData;
import com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData;
import com.okinc.business.market.features.meme.domain.model.MemeTagsData;
import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import com.okinc.business.market.features.meme.domain.model.SignalType;
import com.okinc.business.market.features.meme.domain.model.XMedia;
import com.okinc.business.market.features.meme.filter.domain.MemeBlacklist;
import com.okinc.business.market.features.meme.ui.mapper.MemePumpMapperKt$mapToUiModel$1;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28927kjx {

    /* JADX INFO: renamed from: o.kjx$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignalType.values().length];
            try {
                iArr[SignalType.FOLLOWING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SignalType.KOL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SignalType.SMART_MONEY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SignalType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[XPostType.values().length];
            try {
                iArr2[XPostType.PROFILE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[XPostType.POST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[XPostType.COMMUNITY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:11|221|12|13|215|131|(1:133)|134|(1:136)|137|205|116|(15:118|119|213|120|121|211|122|123|197|124|125|217|126|127|(1:129)(10:130|215|131|(0)|134|(0)|137|205|116|(16:151|207|152|(1:154)(1:155)|(1:157)(1:158)|159|(1:161)(1:162)|(1:164)(1:165)|166|(1:179)(2:168|(1:178)(2:170|(1:174)(2:175|176)))|180|181|225|(5:21|209|22|(2:23|(3:201|25|(2:231|229)(1:228))(2:226|32))|(21:223|34|(2:35|(2:37|(1:233)(1:234))(2:232|40))|41|(2:42|(2:44|(1:236)(1:237))(2:235|47))|48|49|(1:55)(1:53)|56|(1:64)(1:62)|(1:71)(1:68)|72|(1:82)(11:76|199|77|(1:79)|84|(2:85|(5:87|88|203|89|(1:92)(0))(2:238|95))|81|194|195|225|(1:19))|83|84|(3:85|(0)(0)|92)|81|194|195|225|(1:19))(1:191))|224|196)(0)))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:118|119|213|120|121|211|122|123|197|124|125|217|126|127|(1:129)(10:130|215|131|(0)|134|(0)|137|205|116|(16:151|207|152|(1:154)(1:155)|(1:157)(1:158)|159|(1:161)(1:162)|(1:164)(1:165)|166|(1:179)(2:168|(1:178)(2:170|(1:174)(2:175|176)))|180|181|225|(5:21|209|22|(2:23|(3:201|25|(2:231|229)(1:228))(2:226|32))|(21:223|34|(2:35|(2:37|(1:233)(1:234))(2:232|40))|41|(2:42|(2:44|(1:236)(1:237))(2:235|47))|48|49|(1:55)(1:53)|56|(1:64)(1:62)|(1:71)(1:68)|72|(1:82)(11:76|199|77|(1:79)|84|(2:85|(5:87|88|203|89|(1:92)(0))(2:238|95))|81|194|195|225|(1:19))|83|84|(3:85|(0)(0)|92)|81|194|195|225|(1:19))(1:191))|224|196)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:87|88|203|89|(1:92)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c9, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02ca, code lost:
    
        if (r1 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02cc, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02cd, code lost:
    
        r3 = r0.AwvSrB();
        r16 = r0.DTwDnp();
        r17 = r0.zuBGHE();
        r18 = r0.AxsJAY();
        r19 = r0.sSMYrx();
        r20 = r0.OLrzqt();
        r21 = r0.AEQbTJ();
        r22 = r0.AYXKKw();
        r23 = r0.DbNXlk();
        r24 = o.C23319hvw.getNumberICU$default(r0.DbNXlk(), null, null, null, null, 15, null);
        r25 = r0.ORxRYg();
        r26 = o.C23319hvw.getNumberICU$default(r0.ORxRYg(), null, null, null, null, 15, null);
        r27 = r0.QOLQEE();
        r28 = r0.QKVWgx();
        r29 = r0.values();
        r43 = o.C23272hvB.KWHzl;
        r44 = o.C23272hvB.formatScientificCurrency$default(r43, r0.values(), true, null, false, false, false, false, null, false, false, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_POSITION_TYPE, null);
        r45 = r0.QVAiDq();
        r30 = o.C23272hvB.formatScientificCurrency$default(r43, r0.QVAiDq(), true, null, false, false, false, false, null, false, false, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_POSITION_TYPE, null);
        r31 = r0.DbNXlk();
        r32 = r0.AhwBna();
        r47 = r0.OcIXYQ();
        r48 = r0.gEmmrt();
        r50 = r0.zsXlph();
        r51 = r0.AubY();
        r52 = r0.zLjUOn();
        r53 = r0.AuCTelauCTel();
        r54 = r0.EZpvd();
        r55 = r0.isConnected();
        r56 = r0.wlaJM();
        r57 = r0.AhwBna();
        r33 = r0.gHZMYf().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03ab, code lost:
    
        if (r33.hasNext() == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03ad, code lost:
    
        r34 = r33.next();
        r36 = r1;
        r35 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03c3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) ((com.okinc.business.market.data.model.CompactTagData) r34).copydefault(), (java.lang.Object) "devHoldingStatus_sellAll") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03c6, code lost:
    
        r3 = r35;
        r1 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03cb, code lost:
    
        r36 = r1;
        r35 = r3;
        r34 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03d1, code lost:
    
        if (r34 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03d3, code lost:
    
        r49 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03d6, code lost:
    
        r49 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03d8, code lost:
    
        r1 = new com.okinc.business.market.features.meme.domain.model.MemeTagsData(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57);
        r3 = r0.gHZMYf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03ec, code lost:
    
        r74 = r1;
        r55 = r2;
        r56 = r7;
        r78 = r8;
        r2 = r18;
        r58 = r19;
        r59 = r20;
        r60 = r21;
        r61 = r22;
        r62 = r23;
        r63 = r24;
        r64 = r25;
        r65 = r26;
        r66 = r27;
        r67 = r28;
        r68 = r29;
        r71 = r30;
        r72 = r31;
        r73 = r32;
        r30 = new java.util.ArrayList();
        r69 = r44;
        r70 = r45;
        r1 = r80;
        r26 = r81;
        r8 = r56;
        r27 = r10;
        r29 = r13;
        r28 = r14;
        r13 = r17;
        r14 = r35;
        r10 = r36;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r79;
        r79 = r3.iterator();
        r3 = r0;
        r0 = r15;
        r15 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0588, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0589, code lost:
    
        r61 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x058b, code lost:
    
        r5 = r55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x058f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0590, code lost:
    
        r61 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0592, code lost:
    
        r60 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0595, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0596, code lost:
    
        r61 = r5;
        r59 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x059b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x059c, code lost:
    
        r58 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x06f8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x06f9, code lost:
    
        r57 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0707, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02c0, code lost:
    
        r17 = (com.okinc.business.market.data.model.common.ChainInfoData) r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02c2, code lost:
    
        if (r17 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02c4, code lost:
    
        r1 = r17.KWHzl();
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x043b A[Catch: Exception -> 0x06f8, TRY_LEAVE, TryCatch #4 {Exception -> 0x06f8, blocks: (B:116:0x0435, B:118:0x043b), top: B:205:0x0435 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0560 A[Catch: Exception -> 0x057b, TRY_LEAVE, TryCatch #9 {Exception -> 0x057b, blocks: (B:131:0x0555, B:134:0x055c, B:136:0x0560), top: B:215:0x0555 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0298 A[Catch: Exception -> 0x070a, TRY_LEAVE, TryCatch #1 {Exception -> 0x070a, blocks: (B:77:0x026a, B:79:0x0272, B:84:0x0286, B:85:0x0292, B:87:0x0298), top: B:199:0x026a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x03ec -> B:205:0x0435). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x0513 -> B:215:0x0555). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x0719 -> B:195:0x0720). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(@NotNull java.util.List<C28635keW> list, @NotNull ConfigInfoData configInfoData, @NotNull java.util.List<MemeBlacklist> list2, @NotNull C29712kyn c29712kyn, @NotNull Continuation<? super java.util.List<MemeUiModel>> continuation) {
        MemePumpMapperKt$mapToUiModel$1 memePumpMapperKt$mapToUiModel$1;
        java.util.List arrayList;
        MemePumpMapperKt$mapToUiModel$1 memePumpMapperKt$mapToUiModel$12;
        java.util.Iterator<C28635keW> it;
        java.lang.String str;
        ConfigInfoData configInfoData2;
        java.util.List<MemeBlacklist> list3;
        C29712kyn c29712kyn2;
        ConfigInfoData configInfoData3;
        java.util.List<MemeBlacklist> list4;
        java.lang.Object obj;
        java.util.Iterator<C28635keW> it2;
        MemePumpMapperKt$mapToUiModel$1 memePumpMapperKt$mapToUiModel$13;
        java.lang.Object next;
        java.util.List<MemeSocialMediaData> listKWHzl;
        java.lang.Object next2;
        java.lang.Object next3;
        ProtocolInfoData protocolInfoData;
        int iKWHzl;
        java.util.Iterator<T> it3;
        int i;
        java.lang.Object next4;
        MemeTagsData memeTagsData;
        java.util.List list5;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        int i2;
        java.util.List list6;
        int i3;
        int i4;
        int i5;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.util.Iterator<C28635keW> it4;
        C28635keW c28635keW;
        java.lang.String str20;
        java.util.List<java.lang.String> protocolGradientColor;
        java.util.List<java.lang.String> protocolGradientColor2;
        java.util.List<java.lang.String> protocolGradientColor3;
        java.lang.String str21;
        java.util.List<java.lang.String> protocolGradientColor4;
        C29712kyn c29712kyn3;
        java.util.List<MemeBlacklist> list7;
        MemeCarSharingType memeCarSharingType;
        java.lang.Object objM7386unboximpl;
        java.util.Collection collection;
        ConfigInfoData configInfoData4;
        if (continuation instanceof MemePumpMapperKt$mapToUiModel$1) {
            memePumpMapperKt$mapToUiModel$1 = (MemePumpMapperKt$mapToUiModel$1) continuation;
            int i6 = memePumpMapperKt$mapToUiModel$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                memePumpMapperKt$mapToUiModel$1.label = i6 - Integer.MIN_VALUE;
            } else {
                memePumpMapperKt$mapToUiModel$1 = new MemePumpMapperKt$mapToUiModel$1(continuation);
            }
        }
        java.lang.Object obj2 = memePumpMapperKt$mapToUiModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i7 = memePumpMapperKt$mapToUiModel$1.label;
        java.lang.String str22 = "";
        if (i7 == 0) {
            C56391yDq.AEQbTJ(obj2);
            arrayList = new java.util.ArrayList();
            memePumpMapperKt$mapToUiModel$12 = memePumpMapperKt$mapToUiModel$1;
            it = list.iterator();
            str = "";
            configInfoData2 = configInfoData;
            list3 = list2;
            c29712kyn2 = c29712kyn;
            while (it.hasNext()) {
            }
            return arrayList;
        }
        if (i7 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i8 = memePumpMapperKt$mapToUiModel$1.I$3;
        int i9 = memePumpMapperKt$mapToUiModel$1.I$2;
        int i10 = memePumpMapperKt$mapToUiModel$1.I$1;
        int i11 = memePumpMapperKt$mapToUiModel$1.I$0;
        java.util.List list8 = (java.util.List) memePumpMapperKt$mapToUiModel$1.L$34;
        java.util.Iterator it5 = (java.util.Iterator) memePumpMapperKt$mapToUiModel$1.L$33;
        java.util.Collection collection2 = (java.util.Collection) memePumpMapperKt$mapToUiModel$1.L$32;
        MemeTagsData memeTagsData2 = (MemeTagsData) memePumpMapperKt$mapToUiModel$1.L$31;
        java.lang.String str23 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$30;
        java.lang.String str24 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$29;
        java.lang.String str25 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$28;
        java.lang.String str26 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$27;
        java.lang.String str27 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$26;
        java.lang.String str28 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$25;
        java.lang.String str29 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$24;
        java.lang.String str30 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$23;
        java.lang.String str31 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$22;
        java.lang.String str32 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$21;
        java.lang.String str33 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$20;
        java.lang.String str34 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$19;
        java.lang.String str35 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$18;
        java.lang.String str36 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$17;
        java.lang.String str37 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$16;
        java.lang.String str38 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$15;
        java.lang.String str39 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$14;
        java.lang.String str40 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$13;
        java.lang.String str41 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$12;
        java.lang.String str42 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$11;
        java.lang.String str43 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$10;
        java.lang.String str44 = (java.lang.String) memePumpMapperKt$mapToUiModel$1.L$9;
        ProtocolInfoData protocolInfoData2 = (ProtocolInfoData) memePumpMapperKt$mapToUiModel$1.L$8;
        ProtocolInfoData protocolInfoData3 = (ProtocolInfoData) memePumpMapperKt$mapToUiModel$1.L$7;
        java.util.List<MemeSocialMediaData> list9 = (java.util.List) memePumpMapperKt$mapToUiModel$1.L$6;
        C28635keW c28635keW2 = (C28635keW) memePumpMapperKt$mapToUiModel$1.L$5;
        java.util.Iterator<C28635keW> it6 = (java.util.Iterator) memePumpMapperKt$mapToUiModel$1.L$4;
        java.util.List list10 = (java.util.List) memePumpMapperKt$mapToUiModel$1.L$3;
        C29712kyn c29712kyn4 = (C29712kyn) memePumpMapperKt$mapToUiModel$1.L$2;
        java.util.List<MemeBlacklist> list11 = (java.util.List) memePumpMapperKt$mapToUiModel$1.L$1;
        ConfigInfoData configInfoData5 = (ConfigInfoData) memePumpMapperKt$mapToUiModel$1.L$0;
        try {
            C56391yDq.AEQbTJ(obj2);
            objM7386unboximpl = ((Result) obj2).m7386unboximpl();
            str15 = str27;
            str11 = str28;
            str10 = str29;
            str16 = str26;
            str12 = str25;
            list5 = list8;
            memeTagsData = memeTagsData2;
            str14 = str23;
            str13 = str24;
            str9 = str30;
            str8 = str31;
            str7 = str32;
            str6 = str33;
            str5 = str34;
            str4 = str36;
            str3 = str37;
            str17 = str40;
            str20 = str41;
            str18 = str42;
            str19 = str43;
            c29712kyn3 = c29712kyn4;
            list7 = list11;
            i2 = i8;
            memePumpMapperKt$mapToUiModel$13 = memePumpMapperKt$mapToUiModel$1;
            obj = objCopydefault;
            configInfoData4 = configInfoData5;
            i3 = i9;
            i5 = i10;
            i4 = i11;
            collection = collection2;
            str2 = str39;
            protocolInfoData = protocolInfoData2;
            listKWHzl = list9;
            c28635keW = c28635keW2;
            it4 = it6;
            list6 = list10;
        } catch (java.lang.Exception e) {
            e = e;
            memePumpMapperKt$mapToUiModel$13 = memePumpMapperKt$mapToUiModel$1;
            obj = objCopydefault;
            configInfoData2 = configInfoData5;
            str = "";
            it2 = it6;
            arrayList = list10;
            c29712kyn2 = c29712kyn4;
            list3 = list11;
            pUU.copydefault("MemePumpMapper", "unknown exception: " + e);
            objCopydefault = obj;
            memePumpMapperKt$mapToUiModel$12 = memePumpMapperKt$mapToUiModel$13;
            it = it2;
            while (it.hasNext()) {
            }
            return arrayList;
        }
        try {
        } catch (java.lang.Exception e2) {
            e = e2;
            configInfoData2 = configInfoData4;
            it2 = it4;
            arrayList = list6;
            list3 = list7;
            str = str22;
            c29712kyn2 = c29712kyn3;
            pUU.copydefault("MemePumpMapper", "unknown exception: " + e);
            objCopydefault = obj;
            memePumpMapperKt$mapToUiModel$12 = memePumpMapperKt$mapToUiModel$13;
            it = it2;
            while (it.hasNext()) {
            }
            return arrayList;
        }
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        TagWrapper tagWrapper = (TagWrapper) objM7386unboximpl;
        if (tagWrapper != null) {
            collection.add(tagWrapper);
        }
        java.lang.Object obj3 = obj;
        java.util.Iterator it7 = it5;
        java.lang.String str45 = str44;
        ProtocolInfoData protocolInfoData4 = protocolInfoData3;
        C29712kyn c29712kyn5 = c29712kyn3;
        java.util.Collection arrayList2 = collection;
        java.lang.String str46 = str35;
        ConfigInfoData configInfoData6 = configInfoData4;
        java.lang.String str47 = str22;
        java.util.List<MemeBlacklist> list12 = list7;
        java.lang.String str48 = str38;
        if (!it7.hasNext()) {
            CompactTagData compactTagData = (CompactTagData) it7.next();
            memePumpMapperKt$mapToUiModel$13.L$0 = configInfoData6;
            memePumpMapperKt$mapToUiModel$13.L$1 = list12;
            memePumpMapperKt$mapToUiModel$13.L$2 = c29712kyn5;
            memePumpMapperKt$mapToUiModel$13.L$3 = list6;
            memePumpMapperKt$mapToUiModel$13.L$4 = it4;
            memePumpMapperKt$mapToUiModel$13.L$5 = c28635keW;
            memePumpMapperKt$mapToUiModel$13.L$6 = listKWHzl;
            memePumpMapperKt$mapToUiModel$13.L$7 = protocolInfoData4;
            memePumpMapperKt$mapToUiModel$13.L$8 = protocolInfoData;
            memePumpMapperKt$mapToUiModel$13.L$9 = str45;
            memePumpMapperKt$mapToUiModel$13.L$10 = str19;
            memePumpMapperKt$mapToUiModel$13.L$11 = str18;
            memePumpMapperKt$mapToUiModel$13.L$12 = str20;
            memePumpMapperKt$mapToUiModel$13.L$13 = str17;
            memePumpMapperKt$mapToUiModel$13.L$14 = str2;
            ConfigInfoData configInfoData7 = configInfoData6;
            java.lang.String str49 = str48;
            memePumpMapperKt$mapToUiModel$13.L$15 = str49;
            list7 = list12;
            java.lang.String str50 = str3;
            memePumpMapperKt$mapToUiModel$13.L$16 = str50;
            it2 = it4;
            java.lang.String str51 = str4;
            memePumpMapperKt$mapToUiModel$13.L$17 = str51;
            java.util.List list13 = list6;
            java.lang.String str52 = str46;
            memePumpMapperKt$mapToUiModel$13.L$18 = str52;
            java.util.List<MemeSocialMediaData> list14 = listKWHzl;
            java.lang.String str53 = str5;
            memePumpMapperKt$mapToUiModel$13.L$19 = str53;
            java.lang.String str54 = str6;
            memePumpMapperKt$mapToUiModel$13.L$20 = str54;
            java.lang.String str55 = str7;
            memePumpMapperKt$mapToUiModel$13.L$21 = str55;
            java.lang.String str56 = str8;
            memePumpMapperKt$mapToUiModel$13.L$22 = str56;
            java.lang.String str57 = str9;
            memePumpMapperKt$mapToUiModel$13.L$23 = str57;
            java.lang.String str58 = str10;
            memePumpMapperKt$mapToUiModel$13.L$24 = str58;
            java.lang.String str59 = str11;
            memePumpMapperKt$mapToUiModel$13.L$25 = str59;
            java.lang.String str60 = str15;
            memePumpMapperKt$mapToUiModel$13.L$26 = str60;
            java.lang.String str61 = str16;
            memePumpMapperKt$mapToUiModel$13.L$27 = str61;
            java.lang.String str62 = str12;
            memePumpMapperKt$mapToUiModel$13.L$28 = str62;
            java.lang.String str63 = str13;
            memePumpMapperKt$mapToUiModel$13.L$29 = str63;
            java.lang.String str64 = str14;
            memePumpMapperKt$mapToUiModel$13.L$30 = str64;
            MemeTagsData memeTagsData3 = memeTagsData;
            memePumpMapperKt$mapToUiModel$13.L$31 = memeTagsData3;
            java.util.Collection collection3 = arrayList2;
            memePumpMapperKt$mapToUiModel$13.L$32 = collection3;
            java.util.Iterator it8 = it7;
            memePumpMapperKt$mapToUiModel$13.L$33 = it8;
            java.util.List list15 = list5;
            memePumpMapperKt$mapToUiModel$13.L$34 = list15;
            list5 = list15;
            int i12 = i4;
            memePumpMapperKt$mapToUiModel$13.I$0 = i12;
            int i13 = i5;
            memePumpMapperKt$mapToUiModel$13.I$1 = i13;
            int i14 = i3;
            memePumpMapperKt$mapToUiModel$13.I$2 = i14;
            int i15 = i2;
            memePumpMapperKt$mapToUiModel$13.I$3 = i15;
            java.lang.String str65 = str2;
            memePumpMapperKt$mapToUiModel$13.label = 1;
            java.lang.Object objEZpvd = c29712kyn5.EZpvd(compactTagData, (62 & 2) != 0 ? null : null, (62 & 4) != 0 ? null : null, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) != 0 ? null : null, memePumpMapperKt$mapToUiModel$13);
            c29712kyn3 = c29712kyn5;
            obj = obj3;
            if (objEZpvd == obj) {
                return obj;
            }
            str38 = str49;
            str35 = str52;
            str5 = str53;
            str6 = str54;
            str7 = str55;
            str8 = str56;
            str9 = str57;
            str10 = str58;
            str11 = str59;
            str15 = str60;
            str16 = str61;
            str12 = str62;
            str13 = str63;
            str14 = str64;
            memeTagsData = memeTagsData3;
            str44 = str45;
            objM7386unboximpl = objEZpvd;
            i3 = i14;
            protocolInfoData3 = protocolInfoData4;
            str2 = str65;
            it5 = it8;
            str22 = str47;
            i2 = i15;
            collection = collection3;
            listKWHzl = list14;
            configInfoData4 = configInfoData7;
            i5 = i13;
            it4 = it2;
            str3 = str50;
            i4 = i12;
            list6 = list13;
            str4 = str51;
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            }
            TagWrapper tagWrapper2 = (TagWrapper) objM7386unboximpl;
            if (tagWrapper2 != null) {
            }
            java.lang.Object obj32 = obj;
            java.util.Iterator it72 = it5;
            java.lang.String str452 = str44;
            ProtocolInfoData protocolInfoData42 = protocolInfoData3;
            C29712kyn c29712kyn52 = c29712kyn3;
            java.util.Collection arrayList22 = collection;
            java.lang.String str462 = str35;
            ConfigInfoData configInfoData62 = configInfoData4;
            java.lang.String str472 = str22;
            java.util.List<MemeBlacklist> list122 = list7;
            java.lang.String str482 = str38;
            if (!it72.hasNext()) {
                configInfoData7 = configInfoData62;
                java.util.List<MemeSocialMediaData> list16 = listKWHzl;
                int i16 = i2;
                java.util.Collection collection4 = arrayList22;
                java.lang.String str66 = str462;
                java.lang.String str67 = str5;
                java.lang.String str68 = str6;
                java.lang.String str69 = str7;
                java.lang.String str70 = str8;
                java.lang.String str71 = str9;
                java.lang.String str72 = str10;
                java.lang.String str73 = str11;
                java.lang.String str74 = str15;
                java.lang.String str75 = str16;
                java.lang.String str76 = str12;
                java.lang.String str77 = str13;
                java.lang.String str78 = str14;
                MemeTagsData memeTagsData4 = memeTagsData;
                java.lang.String str79 = str2;
                c29712kyn3 = c29712kyn52;
                obj = obj32;
                java.lang.String str80 = str482;
                list7 = list122;
                int i17 = i3;
                java.lang.String str81 = str3;
                it2 = it4;
                int i18 = i5;
                java.lang.String str82 = str4;
                list13 = list6;
                int i19 = i4;
                try {
                } catch (java.lang.Exception e3) {
                    e = e3;
                    str = str472;
                    configInfoData2 = configInfoData7;
                    list3 = list7;
                    arrayList = list13;
                    c29712kyn2 = c29712kyn3;
                    pUU.copydefault("MemePumpMapper", "unknown exception: " + e);
                    objCopydefault = obj;
                    memePumpMapperKt$mapToUiModel$12 = memePumpMapperKt$mapToUiModel$13;
                    it = it2;
                    while (it.hasNext()) {
                    }
                    return arrayList;
                }
                java.util.List list17 = (java.util.List) collection4;
                java.lang.String strFJNWhG = c28635keW.fJNWhG();
                java.lang.String strValueOf = c28635keW.valueOf();
                java.lang.String protocolLogo = protocolInfoData42 != null ? protocolInfoData42.getProtocolLogo() : null;
                java.lang.String str83 = protocolLogo == null ? str472 : protocolLogo;
                java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(i19);
                java.lang.Integer numAEQbTJ2 = C56443yFo.AEQbTJ(i18);
                java.lang.String protocolLogo2 = protocolInfoData != null ? protocolInfoData.getProtocolLogo() : null;
                MemeProtocolUiData memeProtocolUiData = new MemeProtocolUiData(str83, numAEQbTJ, numAEQbTJ2, protocolLogo2 == null ? str472 : protocolLogo2, C56443yFo.AEQbTJ(i17), C56443yFo.AEQbTJ(i16));
                java.lang.String strAuCTel = c28635keW.AuCTel();
                Media mediaAkhnZx = c28635keW.AkhnZx();
                java.util.List<CompactTagData> listGHZMYf = c28635keW.gHZMYf();
                long jUzCIH = c28635keW.uzCIH();
                java.lang.String newProxyInstance = c28635keW.getNewProxyInstance();
                int i20 = StateListAnimator.AEQbTJ[c28635keW.hDKMBd().ordinal()];
                if (i20 == 1) {
                    memeCarSharingType = MemeCarSharingType.FOLLOWING;
                } else if (i20 == 2) {
                    memeCarSharingType = MemeCarSharingType.KOL;
                } else {
                    if (i20 != 3 && i20 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    memeCarSharingType = MemeCarSharingType.SMART_MONEY;
                }
                C56443yFo.KWHzl(list5.add(new MemeUiModel(str452, str19, str18, str20, str17, str79, str80, str81, str82, str66, str67, str68, str69, str70, str71, str72, str73, str74, str75, str76, str77, str78, memeTagsData4, list17, strFJNWhG, strValueOf, memeProtocolUiData, strAuCTel, list16, mediaAkhnZx, listGHZMYf, new MemeCarSharingData(jUzCIH, newProxyInstance, memeCarSharingType, c28635keW.iwGUEr(), c28635keW.getFieldNames()), c28635keW.fARcdN(), c28635keW.fIwbmz(), c28635keW.ejfBZ(), false, c28635keW.QUSxYX(), new AiSheetExtras(c28635keW.AkhnZx().gEmmrt(), c28635keW.AkhnZx().KWHzl(), c28635keW.AuCTel()))));
                str = str472;
                objCopydefault = obj;
                memePumpMapperKt$mapToUiModel$12 = memePumpMapperKt$mapToUiModel$13;
                configInfoData2 = configInfoData7;
                list3 = list7;
                it = it2;
                arrayList = list13;
                c29712kyn2 = c29712kyn3;
                while (it.hasNext()) {
                    C28635keW next5 = it.next();
                    try {
                    } catch (java.lang.Exception e4) {
                        e = e4;
                        configInfoData3 = configInfoData2;
                        list4 = list3;
                    }
                    java.util.Iterator<T> it9 = list3.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next = null;
                            break;
                        }
                        try {
                        } catch (java.lang.Exception e5) {
                            e = e5;
                            list4 = list3;
                            configInfoData3 = configInfoData2;
                            MemePumpMapperKt$mapToUiModel$1 memePumpMapperKt$mapToUiModel$14 = memePumpMapperKt$mapToUiModel$12;
                            obj = objCopydefault;
                            list3 = list4;
                            it2 = it;
                            memePumpMapperKt$mapToUiModel$13 = memePumpMapperKt$mapToUiModel$14;
                            configInfoData2 = configInfoData3;
                            pUU.copydefault("MemePumpMapper", "unknown exception: " + e);
                            objCopydefault = obj;
                            memePumpMapperKt$mapToUiModel$12 = memePumpMapperKt$mapToUiModel$13;
                            it = it2;
                            while (it.hasNext()) {
                            }
                            return arrayList;
                        }
                        next = it9.next();
                        MemeBlacklist memeBlacklist = (MemeBlacklist) next;
                        if (Intrinsics.EZpvd((java.lang.Object) memeBlacklist.getChainId(), (java.lang.Object) next5.KWHzl()) && Intrinsics.EZpvd((java.lang.Object) memeBlacklist.getTokenAddress(), (java.lang.Object) next5.AwvSrB())) {
                            break;
                        }
                    }
                    if (next == null) {
                        listKWHzl = KWHzl(next5.AkhnZx());
                        java.util.Iterator<T> it10 = configInfoData2.getProtocolInfos().iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it10.next();
                            if (Intrinsics.EZpvd((java.lang.Object) ((ProtocolInfoData) next2).getProtocolId(), (java.lang.Object) next5.fJNWhG())) {
                                break;
                            }
                        }
                        protocolInfoData42 = (ProtocolInfoData) next2;
                        java.util.Iterator<T> it11 = configInfoData2.getProtocolInfos().iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it11.next();
                            if (Intrinsics.EZpvd((java.lang.Object) ((ProtocolInfoData) next3).getProtocolId(), (java.lang.Object) next5.valueOf())) {
                                break;
                            }
                        }
                        protocolInfoData = (ProtocolInfoData) next3;
                        int iKWHzl2 = C31256lqb.KWHzl((protocolInfoData42 == null || (protocolGradientColor4 = protocolInfoData42.getProtocolGradientColor()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(protocolGradientColor4, 0), C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
                        int iKWHzl3 = (protocolInfoData42 == null || (protocolGradientColor3 = protocolInfoData42.getProtocolGradientColor()) == null || (str21 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(protocolGradientColor3, 1)) == null) ? iKWHzl2 : C31256lqb.KWHzl(str21, C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
                        int iKWHzl4 = C31256lqb.KWHzl((protocolInfoData == null || (protocolGradientColor2 = protocolInfoData.getProtocolGradientColor()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(protocolGradientColor2, 0), C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
                        if (protocolInfoData == null || (protocolGradientColor = protocolInfoData.getProtocolGradientColor()) == null) {
                            list4 = list3;
                        } else {
                            list4 = list3;
                            try {
                            } catch (java.lang.Exception e6) {
                                e = e6;
                                configInfoData3 = configInfoData2;
                                MemePumpMapperKt$mapToUiModel$1 memePumpMapperKt$mapToUiModel$142 = memePumpMapperKt$mapToUiModel$12;
                                obj = objCopydefault;
                                list3 = list4;
                                it2 = it;
                                memePumpMapperKt$mapToUiModel$13 = memePumpMapperKt$mapToUiModel$142;
                                configInfoData2 = configInfoData3;
                                pUU.copydefault("MemePumpMapper", "unknown exception: " + e);
                                objCopydefault = obj;
                                memePumpMapperKt$mapToUiModel$12 = memePumpMapperKt$mapToUiModel$13;
                                it = it2;
                                while (it.hasNext()) {
                                }
                                return arrayList;
                            }
                            java.lang.String str84 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(protocolGradientColor, 1);
                            if (str84 != null) {
                                iKWHzl = C31256lqb.KWHzl(str84, C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
                            }
                            java.lang.String strKWHzl = next5.KWHzl();
                            it3 = configInfoData2.getChainInfos().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    configInfoData3 = configInfoData2;
                                    i = iKWHzl;
                                    next4 = null;
                                    break;
                                }
                                next4 = it3.next();
                                configInfoData3 = configInfoData2;
                                i = iKWHzl;
                                if (!Intrinsics.EZpvd((java.lang.Object) ((ChainInfoData) next4).EZpvd(), (java.lang.Object) next5.KWHzl())) {
                                    configInfoData2 = configInfoData3;
                                    iKWHzl = i;
                                }
                            }
                            MemePumpMapperKt$mapToUiModel$1 memePumpMapperKt$mapToUiModel$1422 = memePumpMapperKt$mapToUiModel$12;
                            obj = objCopydefault;
                            list3 = list4;
                            it2 = it;
                            memePumpMapperKt$mapToUiModel$13 = memePumpMapperKt$mapToUiModel$1422;
                            configInfoData2 = configInfoData3;
                            pUU.copydefault("MemePumpMapper", "unknown exception: " + e);
                            objCopydefault = obj;
                            memePumpMapperKt$mapToUiModel$12 = memePumpMapperKt$mapToUiModel$13;
                            it = it2;
                            while (it.hasNext()) {
                            }
                        }
                        iKWHzl = iKWHzl4;
                        java.lang.String strKWHzl2 = next5.KWHzl();
                        it3 = configInfoData2.getChainInfos().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                            }
                            configInfoData2 = configInfoData3;
                            iKWHzl = i;
                        }
                        MemePumpMapperKt$mapToUiModel$1 memePumpMapperKt$mapToUiModel$14222 = memePumpMapperKt$mapToUiModel$12;
                        obj = objCopydefault;
                        list3 = list4;
                        it2 = it;
                        memePumpMapperKt$mapToUiModel$13 = memePumpMapperKt$mapToUiModel$14222;
                        configInfoData2 = configInfoData3;
                        pUU.copydefault("MemePumpMapper", "unknown exception: " + e);
                        objCopydefault = obj;
                        memePumpMapperKt$mapToUiModel$12 = memePumpMapperKt$mapToUiModel$13;
                        it = it2;
                        while (it.hasNext()) {
                        }
                    } else {
                        configInfoData2 = configInfoData2;
                    }
                }
                return arrayList;
            }
        }
    }

    public static final java.util.List<MemeSocialMediaData> KWHzl(@NotNull Media media) {
        Intrinsics.checkNotNullParameter(media, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (media.djBIcL() != null) {
            java.lang.String strKWHzl = media.djBIcL().KWHzl();
            XPostType xPostTypeOLrzqt = media.djBIcL().OLrzqt();
            int i = xPostTypeOLrzqt == null ? -1 : StateListAnimator.EZpvd[xPostTypeOLrzqt.ordinal()];
            arrayList.add(new MemeSocialMediaData(null, strKWHzl, i != 1 ? i != 2 ? i != 3 ? C52761wXj.TaskDescription.ICustomTabsServiceDefault : C52761wXj.TaskDescription.vLaW : C23274hvD.ActionBar.gHZMYf : C52761wXj.TaskDescription.UimiPOhkCVbT, java.lang.Integer.valueOf(C52761wXj.TaskDescription.ICustomTabsServiceDefault), java.lang.Integer.valueOf(C23274hvD.Fragment.bindRcKey), java.lang.Integer.valueOf(C23274hvD.Fragment.bindRcKey), null, "social_links_x", null, null, media.djBIcL().OLrzqt(), C33129mqd.valueOf(media.djBIcL().EZpvd()), false, 4929, null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) media.gEmmrt())) {
            arrayList.add(new MemeSocialMediaData(null, media.gEmmrt(), C52761wXj.TaskDescription.ikIEnW, null, null, java.lang.Integer.valueOf(C23274hvD.Fragment.lambdaexecute0), java.lang.Integer.valueOf(C23274hvD.Fragment.ComponentActivityReportFullyDrawnExecutorApi16ImplExternalSyntheticLambda0), "social_links_website", null, java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.DCUTEIddSDPG)), null, 0L, false, 7449, null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) media.KWHzl())) {
            arrayList.add(new MemeSocialMediaData(null, media.KWHzl(), C52761wXj.TaskDescription.SaJVGb, null, java.lang.Integer.valueOf(C23274hvD.Fragment.onStart), null, null, "social_links_telegram", null, null, null, 0L, false, 8041, null));
        }
        if (media.AYXKKw() != null) {
            arrayList.add(new MemeSocialMediaData(null, media.AYXKKw().OLrzqt(), C52761wXj.TaskDescription.ICustomTabsServiceStub, null, java.lang.Integer.valueOf(C23274hvD.Fragment.addReporter), null, null, "social_links_youtube", null, null, null, 0L, false, 8041, null));
        }
        if (media.copydefault() != null) {
            arrayList.add(new MemeSocialMediaData(null, media.copydefault().AEQbTJ(), C52761wXj.TaskDescription.invokespecialsiEkQe, null, java.lang.Integer.valueOf(C23274hvD.Fragment.ComponentDialog), null, null, "social_links_facebook", null, null, null, 0L, false, 8041, null));
        }
        if (media.valueOf() != null) {
            arrayList.add(new MemeSocialMediaData(null, media.valueOf().EZpvd(), C52761wXj.TaskDescription.zUtmHU, null, java.lang.Integer.valueOf(C23274hvD.Fragment.FullyDrawnReporter), null, null, "social_links_twitch", null, null, null, 0L, false, 8041, null));
        }
        if (media.AEQbTJ() != null) {
            arrayList.add(new MemeSocialMediaData(null, media.AEQbTJ().copydefault(), C52761wXj.TaskDescription.dbUqJD, null, java.lang.Integer.valueOf(C23274hvD.Fragment.getOnBackPressedDispatcherannotations), null, null, "social_links_instagram", null, null, null, 0L, false, 8041, null));
        }
        if (media.EZpvd() != null) {
            arrayList.add(new MemeSocialMediaData(null, media.EZpvd().KWHzl(), C52761wXj.TaskDescription.ScLVFT, null, java.lang.Integer.valueOf(C23274hvD.Fragment.ComponentDialogExternalSyntheticApiModelOutline0), null, null, "social_links_tiktok", null, null, null, 0L, false, 8041, null));
        }
        if (media.OLrzqt() != null) {
            arrayList.add(new MemeSocialMediaData(null, media.OLrzqt().EZpvd(), C52761wXj.TaskDescription.cBPFI, null, java.lang.Integer.valueOf(C23274hvD.Fragment.r8lambdaKrBLxNpMJdSxVU3Lsj65hn0UyA), null, null, "social_links_discord", null, null, null, 0L, false, 8041, null));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Media AEQbTJ(@NotNull SocialMediaData socialMediaData) {
        XMedia xMedia;
        XPostType xPostType;
        XPostType xPostType2;
        Intrinsics.checkNotNullParameter(socialMediaData, "");
        java.lang.String strValueOf = socialMediaData.valueOf();
        java.lang.String strDjBIcL = socialMediaData.djBIcL();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) socialMediaData.AYXKKw().KWHzl())) {
            java.lang.String strKWHzl = socialMediaData.AYXKKw().KWHzl();
            java.lang.String strCopydefault = socialMediaData.AYXKKw().copydefault();
            switch (strCopydefault.hashCode()) {
                case 49:
                    if (!strCopydefault.equals("1")) {
                        xPostType = null;
                    } else {
                        xPostType2 = XPostType.PROFILE;
                        xPostType = xPostType2;
                    }
                    break;
                case 50:
                    if (!strCopydefault.equals("2")) {
                        xPostType = null;
                    } else {
                        xPostType2 = XPostType.POST;
                        xPostType = xPostType2;
                    }
                    break;
                case 51:
                    if (!strCopydefault.equals("3")) {
                        xPostType = null;
                    } else {
                        xPostType2 = XPostType.COMMUNITY;
                        xPostType = xPostType2;
                    }
                    break;
                default:
                    xPostType = null;
                    break;
            }
            xMedia = new XMedia(strKWHzl, xPostType, null, null, 12, null);
        } else {
            xMedia = C33129mqd.OLrzqt((java.lang.CharSequence) socialMediaData.gEmmrt()) ? new XMedia(socialMediaData.gEmmrt(), null, null, null, 14, null) : null;
        }
        return new Media(strValueOf, strDjBIcL, xMedia, null, C33129mqd.OLrzqt((java.lang.CharSequence) socialMediaData.OLrzqt()) ? new FacebookMedia(socialMediaData.OLrzqt(), null, 2, null) : null, null, null, null, C33129mqd.OLrzqt((java.lang.CharSequence) socialMediaData.AEQbTJ()) ? new DiscordMedia(socialMediaData.AEQbTJ(), null, 2, null) : null);
    }

    public static final java.util.List<MemeSocialMediaData> copydefault(@NotNull SocialMediaData socialMediaData) {
        Intrinsics.checkNotNullParameter(socialMediaData, "");
        return KWHzl(AEQbTJ(socialMediaData));
    }
}
