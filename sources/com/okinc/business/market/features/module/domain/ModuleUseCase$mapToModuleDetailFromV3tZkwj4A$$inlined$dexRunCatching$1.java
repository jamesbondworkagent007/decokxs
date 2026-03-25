package com.okinc.business.market.features.module.domain;

import com.okinc.business.dexlogic.bean.ShareLinkVO;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.HomeTokenData;
import com.okinc.business.market.data.model.ModuleBoostHeaderData;
import com.okinc.business.market.data.model.ModuleBoostTokenData;
import com.okinc.business.market.data.model.TokenAggregateData;
import com.okinc.business.market.data.model.TotalTokensData;
import com.okinc.business.market.features.module.domain.type.TimeType;
import com.okinc.business.market.features.tag.domain.CompactTag;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C28896kjS;
import o.C28897kjT;
import o.C28899kjV;
import o.C28902kjY;
import o.C29712kyn;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.module.domain.ModuleUseCase$mapToModuleDetailFromV3-tZkwj4A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class ModuleUseCase$mapToModuleDetailFromV3tZkwj4A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C28899kjV>>, Object> {
    final /* synthetic */ TokenAggregateData $aggregateData$inlined;
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ List $chainList$inlined;
    final /* synthetic */ boolean $isBoostModule$inlined;
    final /* synthetic */ ModuleBoostHeaderData $listedTokenData$inlined;
    final /* synthetic */ C28897kjT $moduleMetadata$inlined;
    final /* synthetic */ TimeType $timeType$inlined;
    final /* synthetic */ List $tokenList$inlined;
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
    Object L$25;
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
    public ModuleUseCase$mapToModuleDetailFromV3tZkwj4A$$inlined$dexRunCatching$1(Continuation continuation, TimeType timeType, C28897kjT c28897kjT, TokenAggregateData tokenAggregateData, List list, String str, boolean z, ModuleBoostHeaderData moduleBoostHeaderData, List list2, C28896kjS c28896kjS) {
        super(2, continuation);
        this.$timeType$inlined = timeType;
        this.$moduleMetadata$inlined = c28897kjT;
        this.$aggregateData$inlined = tokenAggregateData;
        this.$tokenList$inlined = list;
        this.$chainId$inlined = str;
        this.$isBoostModule$inlined = z;
        this.$listedTokenData$inlined = moduleBoostHeaderData;
        this.$chainList$inlined = list2;
        this.this$0 = c28896kjS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModuleUseCase$mapToModuleDetailFromV3tZkwj4A$$inlined$dexRunCatching$1(continuation, this.$timeType$inlined, this.$moduleMetadata$inlined, this.$aggregateData$inlined, this.$tokenList$inlined, this.$chainId$inlined, this.$isBoostModule$inlined, this.$listedTokenData$inlined, this.$chainList$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C28899kjV>> continuation) {
        return ((ModuleUseCase$mapToModuleDetailFromV3tZkwj4A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:138:0x02da) to fix multi-entry loop: BACK_EDGE: B:138:0x02da -> B:139:0x0333 */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0333, code lost:
    
        r23 = r18.values();
        r25 = r18.isConnected();
        r26 = r18.AuCTel();
        r27 = r18.gEmmrt();
        r28 = r18.AEQbTJ();
        r29 = r18.AYXKKw();
        r30 = r18.DbNXlk();
        r18 = r18.AhwBna();
        r31 = new java.util.ArrayList();
        r35 = r1;
        r36 = r6;
        r1 = r9;
        r6 = r18.iterator();
        r32 = r20;
        r20 = r21;
        r37 = r23;
        r18 = r24;
        r38 = r25;
        r39 = r26;
        r40 = r27;
        r41 = r28;
        r42 = r29;
        r43 = r30;
        r30 = r0;
        r9 = r2;
        r0 = r12;
        r12 = r10;
        r10 = r22;
        r2 = r8;
        r8 = r3;
        r3 = r7;
        r7 = r4;
        r4 = r13;
        r13 = r14;
        r14 = r15;
        r15 = r9;
        r31 = r19;
        r19 = r31;
     */
    /* JADX WARN: Path cross not found for [B:17:0x0144, B:34:0x016e], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:19:0x0147, B:31:0x0165], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:21:0x014a, B:28:0x015c], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:55:0x01a3, B:57:0x01b3], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:57:0x01b3, B:55:0x01a3], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:59:0x01b6, B:61:0x01c6], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:61:0x01c6, B:59:0x01b6], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:64:0x01cb, B:67:0x01d3], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:67:0x01d3, B:64:0x01cb], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:70:0x01d8, B:73:0x01df], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:73:0x01df, B:70:0x01d8], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:82:0x01f1, B:92:0x020a], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:92:0x020a, B:82:0x01f1], limit reached: 207 */
    /* JADX WARN: Path cross not found for [B:92:0x020a, B:84:0x01f7], limit reached: 207 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021b A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0228 A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0279 A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0339 A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x044f A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0464 A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04d1 A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05b2 A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05bf A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05ce A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05db A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017f A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0187 A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018f A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0197 A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d8 A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e4 A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f1 A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020e A[Catch: all -> 0x05f9, CancellationException -> 0x0610, TryCatch #2 {CancellationException -> 0x0610, all -> 0x05f9, blocks: (B:7:0x004c, B:171:0x0566, B:174:0x056e, B:176:0x05ae, B:178:0x05b2, B:180:0x05bb, B:182:0x05bf, B:184:0x05c8, B:186:0x05ce, B:188:0x05d7, B:190:0x05db, B:192:0x05e4, B:196:0x05ed, B:12:0x00ed, B:145:0x043c, B:149:0x0449, B:151:0x044f, B:139:0x0333, B:141:0x0339, B:153:0x0464, B:115:0x0273, B:117:0x0279, B:121:0x0290, B:122:0x0296, B:124:0x029c, B:129:0x02c0, B:131:0x02c4, B:135:0x02ce, B:138:0x02da, B:154:0x04d1, B:156:0x04dd, B:158:0x04e3, B:160:0x04e7, B:162:0x04ed, B:167:0x04fa, B:15:0x0135, B:23:0x014d, B:25:0x0151, B:40:0x017b, B:42:0x017f, B:45:0x0187, B:48:0x018f, B:51:0x0197, B:53:0x019d, B:56:0x01a5, B:60:0x01b8, B:62:0x01c7, B:64:0x01cb, B:68:0x01d4, B:70:0x01d8, B:74:0x01e0, B:76:0x01e4, B:80:0x01ed, B:82:0x01f1, B:84:0x01f7, B:86:0x01fd, B:88:0x0201, B:98:0x0217, B:100:0x021b, B:104:0x0224, B:106:0x0228, B:110:0x0231, B:114:0x024c, B:92:0x020a, B:94:0x020e, B:26:0x0156, B:27:0x015b, B:28:0x015c, B:30:0x0160, B:31:0x0165, B:33:0x0169, B:34:0x016e, B:36:0x0172), top: B:204:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0216  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x0410 -> B:145:0x043c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String strFetchVPNInfo;
        String strValueOf;
        String strValueOf2;
        int i;
        C28897kjT c28897kjT;
        String strAEQbTJ;
        TokenAggregateData tokenAggregateData;
        String strGEmmrt;
        String strEZpvd;
        String strCopydefault;
        String str;
        Collection arrayList;
        String str2;
        Iterator it;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        TimeType timeType;
        boolean z;
        ShareLinkVO shareLinkVOIsConnected;
        List list;
        ShareLinkVO shareLinkVO;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        TimeType timeType2;
        String str16;
        String str17;
        String str18;
        String str19;
        int i2;
        TagWrapper tagWrapper;
        String str20;
        String strEjfBZ;
        Object objM7386unboximpl;
        String str21;
        String str22;
        String str23;
        int i3;
        List list2;
        String str24;
        String str25;
        String str26;
        Iterator it2;
        int i4;
        Object next;
        String str27;
        Object objCopydefault = C56442yFn.copydefault();
        int i5 = this.label;
        String str28 = "";
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            int i6 = C28896kjS.Application.EZpvd[this.$timeType$inlined.ordinal()];
            if (i6 == 1) {
                C28897kjT c28897kjT2 = this.$moduleMetadata$inlined;
                if (c28897kjT2 != null) {
                    strFetchVPNInfo = c28897kjT2.fetchVPNInfo();
                }
                if (strFetchVPNInfo == null) {
                }
                TokenAggregateData tokenAggregateData2 = this.$aggregateData$inlined;
                if (tokenAggregateData2 == null) {
                }
                if (totalTokensDataKWHzl == null) {
                }
                if (totalTokensDataKWHzl == null) {
                }
                int iOLrzqt = (totalTokensDataKWHzl == null ? totalTokensDataKWHzl.OLrzqt() : 0) + (totalTokensDataKWHzl == null ? totalTokensDataKWHzl.AEQbTJ() : 0) + (totalTokensDataKWHzl == null ? totalTokensDataKWHzl.KWHzl() : 0);
                if (iOLrzqt > 0) {
                }
                if (iOLrzqt > 0) {
                }
                C28897kjT c28897kjT3 = this.$moduleMetadata$inlined;
                if (c28897kjT3 != null) {
                }
                c28897kjT = this.$moduleMetadata$inlined;
                if (c28897kjT != null) {
                }
                String strAuCTel = "--";
                C28897kjT c28897kjT4 = this.$moduleMetadata$inlined;
                if (c28897kjT4 == null) {
                }
                if (strAEQbTJ == null) {
                }
                tokenAggregateData = this.$aggregateData$inlined;
                if (tokenAggregateData != null) {
                }
                C28897kjT c28897kjT5 = this.$moduleMetadata$inlined;
                if (c28897kjT5 == null) {
                }
                if (strGEmmrt == null) {
                }
                TokenAggregateData tokenAggregateData3 = this.$aggregateData$inlined;
                if (tokenAggregateData3 != null) {
                }
                if (strEZpvd == null) {
                }
                TokenAggregateData tokenAggregateData4 = this.$aggregateData$inlined;
                if (tokenAggregateData4 != null) {
                }
                if (strCopydefault == null) {
                }
                String strValueOf3 = String.valueOf(this.$tokenList$inlined.size());
                TimeType timeType3 = this.$timeType$inlined;
                String str29 = strFetchVPNInfo;
                String str30 = this.$chainId$inlined;
                if (str30.length() == 0) {
                }
                List list3 = this.$tokenList$inlined;
                str = "--";
                str2 = "chain_id_all_network";
                arrayList = new ArrayList(C56403yEb.AYXKKw(list3, 10));
                it = list3.iterator();
                str3 = str29;
                str4 = "";
                str5 = str;
                String str31 = strAEQbTJ;
                str6 = strValueOf2;
                str7 = str31;
                str8 = strAuCTel;
                str9 = strValueOf3;
                str10 = strGEmmrt;
                timeType = timeType3;
                if (it.hasNext()) {
                }
            } else if (i6 == 2) {
                C28897kjT c28897kjT6 = this.$moduleMetadata$inlined;
                if (c28897kjT6 != null) {
                    strFetchVPNInfo = c28897kjT6.values();
                }
                if (strFetchVPNInfo == null) {
                }
                TokenAggregateData tokenAggregateData22 = this.$aggregateData$inlined;
                if (tokenAggregateData22 == null) {
                }
                if (totalTokensDataKWHzl == null) {
                }
                if (totalTokensDataKWHzl == null) {
                }
                int iOLrzqt2 = (totalTokensDataKWHzl == null ? totalTokensDataKWHzl.OLrzqt() : 0) + (totalTokensDataKWHzl == null ? totalTokensDataKWHzl.AEQbTJ() : 0) + (totalTokensDataKWHzl == null ? totalTokensDataKWHzl.KWHzl() : 0);
                if (iOLrzqt2 > 0) {
                }
                if (iOLrzqt2 > 0) {
                }
                C28897kjT c28897kjT32 = this.$moduleMetadata$inlined;
                if (c28897kjT32 != null) {
                }
                c28897kjT = this.$moduleMetadata$inlined;
                if (c28897kjT != null) {
                }
                String strAuCTel2 = "--";
                C28897kjT c28897kjT42 = this.$moduleMetadata$inlined;
                if (c28897kjT42 == null) {
                }
                if (strAEQbTJ == null) {
                }
                tokenAggregateData = this.$aggregateData$inlined;
                if (tokenAggregateData != null) {
                }
                C28897kjT c28897kjT52 = this.$moduleMetadata$inlined;
                if (c28897kjT52 == null) {
                }
                if (strGEmmrt == null) {
                }
                TokenAggregateData tokenAggregateData32 = this.$aggregateData$inlined;
                if (tokenAggregateData32 != null) {
                }
                if (strEZpvd == null) {
                }
                TokenAggregateData tokenAggregateData42 = this.$aggregateData$inlined;
                if (tokenAggregateData42 != null) {
                }
                if (strCopydefault == null) {
                }
                String strValueOf32 = String.valueOf(this.$tokenList$inlined.size());
                TimeType timeType32 = this.$timeType$inlined;
                String str292 = strFetchVPNInfo;
                String str302 = this.$chainId$inlined;
                if (str302.length() == 0) {
                }
                List list32 = this.$tokenList$inlined;
                str = "--";
                str2 = "chain_id_all_network";
                arrayList = new ArrayList(C56403yEb.AYXKKw(list32, 10));
                it = list32.iterator();
                str3 = str292;
                str4 = "";
                str5 = str;
                String str312 = strAEQbTJ;
                str6 = strValueOf2;
                str7 = str312;
                str8 = strAuCTel2;
                str9 = strValueOf32;
                str10 = strGEmmrt;
                timeType = timeType32;
                if (it.hasNext()) {
                }
            } else if (i6 == 3) {
                C28897kjT c28897kjT7 = this.$moduleMetadata$inlined;
                if (c28897kjT7 != null) {
                    strFetchVPNInfo = c28897kjT7.AkhnZx();
                }
                if (strFetchVPNInfo == null) {
                }
                TokenAggregateData tokenAggregateData222 = this.$aggregateData$inlined;
                if (tokenAggregateData222 == null) {
                }
                if (totalTokensDataKWHzl == null) {
                }
                if (totalTokensDataKWHzl == null) {
                }
                int iOLrzqt22 = (totalTokensDataKWHzl == null ? totalTokensDataKWHzl.OLrzqt() : 0) + (totalTokensDataKWHzl == null ? totalTokensDataKWHzl.AEQbTJ() : 0) + (totalTokensDataKWHzl == null ? totalTokensDataKWHzl.KWHzl() : 0);
                if (iOLrzqt22 > 0) {
                }
                if (iOLrzqt22 > 0) {
                }
                C28897kjT c28897kjT322 = this.$moduleMetadata$inlined;
                if (c28897kjT322 != null) {
                }
                c28897kjT = this.$moduleMetadata$inlined;
                if (c28897kjT != null) {
                }
                String strAuCTel22 = "--";
                C28897kjT c28897kjT422 = this.$moduleMetadata$inlined;
                if (c28897kjT422 == null) {
                }
                if (strAEQbTJ == null) {
                }
                tokenAggregateData = this.$aggregateData$inlined;
                if (tokenAggregateData != null) {
                }
                C28897kjT c28897kjT522 = this.$moduleMetadata$inlined;
                if (c28897kjT522 == null) {
                }
                if (strGEmmrt == null) {
                }
                TokenAggregateData tokenAggregateData322 = this.$aggregateData$inlined;
                if (tokenAggregateData322 != null) {
                }
                if (strEZpvd == null) {
                }
                TokenAggregateData tokenAggregateData422 = this.$aggregateData$inlined;
                if (tokenAggregateData422 != null) {
                }
                if (strCopydefault == null) {
                }
                String strValueOf322 = String.valueOf(this.$tokenList$inlined.size());
                TimeType timeType322 = this.$timeType$inlined;
                String str2922 = strFetchVPNInfo;
                String str3022 = this.$chainId$inlined;
                if (str3022.length() == 0) {
                }
                List list322 = this.$tokenList$inlined;
                str = "--";
                str2 = "chain_id_all_network";
                arrayList = new ArrayList(C56403yEb.AYXKKw(list322, 10));
                it = list322.iterator();
                str3 = str2922;
                str4 = "";
                str5 = str;
                String str3122 = strAEQbTJ;
                str6 = strValueOf2;
                str7 = str3122;
                str8 = strAuCTel22;
                str9 = strValueOf322;
                str10 = strGEmmrt;
                timeType = timeType322;
                if (it.hasNext()) {
                }
            } else {
                if (i6 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                C28897kjT c28897kjT8 = this.$moduleMetadata$inlined;
                strFetchVPNInfo = c28897kjT8 != null ? c28897kjT8.DbNXlk() : null;
                if (strFetchVPNInfo == null) {
                    strFetchVPNInfo = "";
                }
                TokenAggregateData tokenAggregateData2222 = this.$aggregateData$inlined;
                TotalTokensData totalTokensDataKWHzl = tokenAggregateData2222 == null ? tokenAggregateData2222.KWHzl() : null;
                int iOLrzqt222 = (totalTokensDataKWHzl == null ? totalTokensDataKWHzl.OLrzqt() : 0) + (totalTokensDataKWHzl == null ? totalTokensDataKWHzl.AEQbTJ() : 0) + (totalTokensDataKWHzl == null ? totalTokensDataKWHzl.KWHzl() : 0);
                strValueOf = (iOLrzqt222 > 0 || totalTokensDataKWHzl == null) ? "" : String.valueOf((((double) totalTokensDataKWHzl.OLrzqt()) / ((double) iOLrzqt222)) * ((double) 100));
                strValueOf2 = (iOLrzqt222 > 0 || totalTokensDataKWHzl == null) ? "" : String.valueOf((((double) totalTokensDataKWHzl.AEQbTJ()) / ((double) iOLrzqt222)) * ((double) 100));
                C28897kjT c28897kjT3222 = this.$moduleMetadata$inlined;
                i = (c28897kjT3222 != null || c28897kjT3222.AYXKKw()) ? 0 : 1;
                c28897kjT = this.$moduleMetadata$inlined;
                if (c28897kjT != null || (strAuCTel22 = c28897kjT.AuCTel()) == null) {
                    String strAuCTel222 = "--";
                }
                C28897kjT c28897kjT4222 = this.$moduleMetadata$inlined;
                strAEQbTJ = c28897kjT4222 == null ? c28897kjT4222.AEQbTJ() : null;
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                tokenAggregateData = this.$aggregateData$inlined;
                if (tokenAggregateData != null || (strGEmmrt = tokenAggregateData.AEQbTJ()) == null) {
                    C28897kjT c28897kjT5222 = this.$moduleMetadata$inlined;
                    strGEmmrt = c28897kjT5222 == null ? c28897kjT5222.gEmmrt() : null;
                    if (strGEmmrt == null) {
                        strGEmmrt = "";
                    }
                    TokenAggregateData tokenAggregateData3222 = this.$aggregateData$inlined;
                    strEZpvd = tokenAggregateData3222 != null ? tokenAggregateData3222.EZpvd() : null;
                    if (strEZpvd == null) {
                        strEZpvd = "";
                    }
                    TokenAggregateData tokenAggregateData4222 = this.$aggregateData$inlined;
                    strCopydefault = tokenAggregateData4222 != null ? tokenAggregateData4222.copydefault() : null;
                    if (strCopydefault == null) {
                        strCopydefault = "";
                    }
                    String strValueOf3222 = String.valueOf(this.$tokenList$inlined.size());
                    TimeType timeType3222 = this.$timeType$inlined;
                    String str29222 = strFetchVPNInfo;
                    String str30222 = this.$chainId$inlined;
                    String str32 = str30222.length() == 0 ? "chain_id_all_network" : str30222;
                    List list3222 = this.$tokenList$inlined;
                    str = "--";
                    str2 = "chain_id_all_network";
                    arrayList = new ArrayList(C56403yEb.AYXKKw(list3222, 10));
                    it = list3222.iterator();
                    str3 = str29222;
                    str4 = "";
                    str5 = str32;
                    String str31222 = strAEQbTJ;
                    str6 = strValueOf2;
                    str7 = str31222;
                    str8 = strAuCTel222;
                    str9 = strValueOf3222;
                    str10 = strGEmmrt;
                    timeType = timeType3222;
                    if (it.hasNext()) {
                    }
                } else {
                    if (strGEmmrt.length() == 0) {
                        C28897kjT c28897kjT9 = this.$moduleMetadata$inlined;
                        strGEmmrt = c28897kjT9 != null ? c28897kjT9.gEmmrt() : null;
                        if (strGEmmrt == null) {
                            strGEmmrt = "";
                        }
                    }
                    TokenAggregateData tokenAggregateData32222 = this.$aggregateData$inlined;
                    if (tokenAggregateData32222 != null) {
                    }
                    if (strEZpvd == null) {
                    }
                    TokenAggregateData tokenAggregateData42222 = this.$aggregateData$inlined;
                    if (tokenAggregateData42222 != null) {
                    }
                    if (strCopydefault == null) {
                    }
                    String strValueOf32222 = String.valueOf(this.$tokenList$inlined.size());
                    TimeType timeType32222 = this.$timeType$inlined;
                    String str292222 = strFetchVPNInfo;
                    String str302222 = this.$chainId$inlined;
                    if (str302222.length() == 0) {
                    }
                    List list32222 = this.$tokenList$inlined;
                    str = "--";
                    str2 = "chain_id_all_network";
                    arrayList = new ArrayList(C56403yEb.AYXKKw(list32222, 10));
                    it = list32222.iterator();
                    str3 = str292222;
                    str4 = "";
                    str5 = str32;
                    String str312222 = strAEQbTJ;
                    str6 = strValueOf2;
                    str7 = str312222;
                    str8 = strAuCTel222;
                    str9 = strValueOf32222;
                    str10 = strGEmmrt;
                    timeType = timeType32222;
                    if (it.hasNext()) {
                    }
                }
            }
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = this.I$0;
                shareLinkVOIsConnected = (ShareLinkVO) this.L$12;
                str21 = (String) this.L$11;
                list2 = (List) this.L$10;
                str5 = (String) this.L$9;
                str25 = (String) this.L$8;
                str22 = (String) this.L$7;
                str9 = (String) this.L$6;
                strValueOf = (String) this.L$5;
                str6 = (String) this.L$4;
                timeType = (TimeType) this.L$3;
                str26 = (String) this.L$2;
                str23 = (String) this.L$1;
                str24 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                z = true;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                shareLinkVO = shareLinkVOIsConnected;
                str11 = str21;
                list = list2;
                str12 = str5;
                str16 = str25;
                str17 = str22;
                str20 = str9;
                str14 = strValueOf;
                str15 = str6;
                timeType2 = timeType;
                str18 = str26;
                str19 = str23;
                str13 = str24;
                tagWrapper = (TagWrapper) objM7386unboximpl;
                i2 = i3;
                C28897kjT c28897kjT10 = this.$moduleMetadata$inlined;
                String strCopydefault2 = c28897kjT10 != null ? c28897kjT10.copydefault() : null;
                C28897kjT c28897kjT11 = this.$moduleMetadata$inlined;
                String strEZpvd2 = c28897kjT11 != null ? c28897kjT11.EZpvd() : null;
                boolean z2 = this.$isBoostModule$inlined;
                ModuleBoostHeaderData moduleBoostHeaderData = this.$listedTokenData$inlined;
                List<ModuleBoostTokenData> carouselTokens = moduleBoostHeaderData != null ? moduleBoostHeaderData.getCarouselTokens() : null;
                ModuleBoostHeaderData moduleBoostHeaderData2 = this.$listedTokenData$inlined;
                objM7377constructorimpl = Result.m7377constructorimpl(new C28899kjV(i2 != 0 ? z : false, str19, str13, str18, str16, str17, str20, str14, str15, timeType2, str12, list, str11, shareLinkVO, tagWrapper, strCopydefault2, strEZpvd2, z2, carouselTokens, moduleBoostHeaderData2 != null ? moduleBoostHeaderData2.getCompetitionDeeplink() : null));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            int i7 = this.I$0;
            Iterator it3 = (Iterator) this.L$25;
            String str33 = (String) this.L$24;
            String str34 = (String) this.L$23;
            String str35 = (String) this.L$22;
            String str36 = (String) this.L$21;
            String str37 = (String) this.L$20;
            String str38 = (String) this.L$19;
            String str39 = (String) this.L$18;
            String str40 = (String) this.L$17;
            String str41 = (String) this.L$16;
            int i8 = i7;
            Collection collection = (Collection) this.L$15;
            String str42 = (String) this.L$14;
            Collection collection2 = (Collection) this.L$13;
            Iterator it4 = (Iterator) this.L$12;
            String str43 = (String) this.L$11;
            String str44 = (String) this.L$10;
            String str45 = (String) this.L$9;
            String str46 = (String) this.L$8;
            String str47 = (String) this.L$7;
            String str48 = (String) this.L$6;
            TimeType timeType4 = (TimeType) this.L$5;
            String str49 = (String) this.L$4;
            Collection collection3 = (Collection) this.L$3;
            String str50 = (String) this.L$2;
            String str51 = (String) this.L$1;
            String str52 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
            String str53 = str33;
            String str54 = str34;
            String str55 = str36;
            String str56 = str37;
            String str57 = str40;
            String str58 = str38;
            String str59 = str41;
            String str60 = str39;
            Collection collection4 = collection2;
            Iterator it5 = it4;
            String str61 = str43;
            String str62 = str44;
            String str63 = str45;
            TimeType timeType5 = timeType4;
            String str64 = str49;
            Collection collection5 = collection3;
            String str65 = str50;
            Object obj2 = objCopydefault;
            String str66 = "--";
            String str67 = "chain_id_all_network";
            Iterator it6 = it3;
            Collection collection6 = collection;
            String str68 = str46;
            String str69 = str47;
            str7 = str51;
            String str70 = str35;
            String str71 = str52;
            String str72 = str48;
            if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                str27 = str72;
            } else {
                str27 = str72;
                objM7386unboximpl2 = null;
            }
            TagWrapper tagWrapper2 = (TagWrapper) objM7386unboximpl2;
            if (tagWrapper2 != null) {
                collection6.add(tagWrapper2);
            }
            Object obj3 = obj2;
            String str73 = str27;
            Iterator it7 = it6;
            String str74 = str70;
            Collection collection7 = collection6;
            String str75 = str62;
            str4 = str28;
            String str76 = str63;
            if (it7.hasNext()) {
                CompactTagData compactTagData = (CompactTagData) it7.next();
                Iterator it8 = it7;
                C29712kyn c29712kyn = this.this$0.EZpvd;
                this.L$0 = str71;
                this.L$1 = str7;
                this.L$2 = str65;
                this.L$3 = collection5;
                this.L$4 = str64;
                this.L$5 = timeType5;
                this.L$6 = str73;
                this.L$7 = str69;
                this.L$8 = str68;
                this.L$9 = str76;
                this.L$10 = str75;
                this.L$11 = str61;
                this.L$12 = it5;
                this.L$13 = collection4;
                Iterator it9 = it5;
                String str77 = str42;
                this.L$14 = str77;
                Collection collection8 = collection7;
                this.L$15 = collection8;
                String str78 = str59;
                this.L$16 = str78;
                String str79 = str57;
                this.L$17 = str79;
                String str80 = str60;
                this.L$18 = str80;
                String str81 = str58;
                this.L$19 = str81;
                String str82 = str56;
                this.L$20 = str82;
                String str83 = str55;
                this.L$21 = str83;
                String str84 = str74;
                this.L$22 = str84;
                String str85 = str54;
                this.L$23 = str85;
                String str86 = str53;
                this.L$24 = str86;
                String str87 = str7;
                this.L$25 = it8;
                String str88 = str68;
                int i9 = i8;
                this.I$0 = i9;
                this.label = 1;
                String str89 = str73;
                String str90 = str69;
                str63 = str76;
                it6 = it8;
                String str91 = str61;
                String str92 = str71;
                Collection collection9 = collection5;
                str70 = str84;
                Object objEZpvd = c29712kyn.EZpvd(compactTagData, (62 & 2) != 0 ? null : null, (62 & 4) != 0 ? null : null, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) != 0 ? null : null, this);
                obj2 = obj3;
                if (objEZpvd == obj2) {
                    return obj2;
                }
                str28 = str4;
                str62 = str75;
                collection6 = collection8;
                str55 = str83;
                str56 = str82;
                it5 = it9;
                str7 = str87;
                str61 = str91;
                str71 = str92;
                collection5 = collection9;
                str69 = str90;
                str68 = str88;
                i8 = i9;
                objM7386unboximpl2 = objEZpvd;
                str59 = str78;
                str57 = str79;
                str53 = str86;
                str54 = str85;
                str60 = str80;
                str72 = str89;
                str42 = str77;
                str58 = str81;
                if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                }
                TagWrapper tagWrapper22 = (TagWrapper) objM7386unboximpl2;
                if (tagWrapper22 != null) {
                }
                Object obj32 = obj2;
                String str732 = str27;
                Iterator it72 = it6;
                String str742 = str70;
                Collection collection72 = collection6;
                String str752 = str62;
                str4 = str28;
                String str762 = str63;
                if (it72.hasNext()) {
                    String str93 = str68;
                    String str94 = str762;
                    Iterator it10 = it5;
                    String str95 = str58;
                    String str96 = str60;
                    String str97 = str732;
                    String str98 = str69;
                    collection4.add(new C28902kjY(str42, str59, str57, str53, str54, str742, str55, str56, str95, str96, (List) collection72));
                    timeType = timeType5;
                    str8 = str65;
                    str = str66;
                    str2 = str67;
                    it = it10;
                    str7 = str7;
                    str5 = str61;
                    str3 = str71;
                    arrayList = collection5;
                    str6 = str97;
                    strValueOf = str98;
                    str9 = str93;
                    strEZpvd = str752;
                    objCopydefault = obj32;
                    str10 = str64;
                    strCopydefault = str94;
                    i = i8;
                    if (it.hasNext()) {
                        int i10 = i;
                        z = true;
                        Object obj4 = objCopydefault;
                        List list4 = (List) arrayList;
                        C28897kjT c28897kjT12 = this.$moduleMetadata$inlined;
                        shareLinkVOIsConnected = c28897kjT12 != null ? c28897kjT12.isConnected() : null;
                        C28897kjT c28897kjT13 = this.$moduleMetadata$inlined;
                        if (c28897kjT13 != null && (strEjfBZ = c28897kjT13.ejfBZ()) != null) {
                            String str99 = C33129mqd.OLrzqt((CharSequence) strEjfBZ) ? strEjfBZ : null;
                            if (str99 != null) {
                                C29712kyn c29712kyn2 = this.this$0.EZpvd;
                                CompactTag compactTag = new CompactTag(str99, false, null, 6, null);
                                this.L$0 = str7;
                                this.L$1 = str8;
                                this.L$2 = str10;
                                this.L$3 = timeType;
                                this.L$4 = str6;
                                this.L$5 = strValueOf;
                                this.L$6 = str9;
                                this.L$7 = strCopydefault;
                                this.L$8 = strEZpvd;
                                this.L$9 = str5;
                                this.L$10 = list4;
                                this.L$11 = str3;
                                this.L$12 = shareLinkVOIsConnected;
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
                                this.L$25 = null;
                                this.I$0 = i10;
                                this.label = 2;
                                Object objAEQbTJ = c29712kyn2.AEQbTJ(compactTag, this);
                                if (objAEQbTJ == obj4) {
                                    return obj4;
                                }
                                objM7386unboximpl = objAEQbTJ;
                                str21 = str3;
                                str22 = strCopydefault;
                                str23 = str8;
                                i3 = i10;
                                list2 = list4;
                                str24 = str7;
                                str25 = strEZpvd;
                                str26 = str10;
                                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                                }
                                shareLinkVO = shareLinkVOIsConnected;
                                str11 = str21;
                                list = list2;
                                str12 = str5;
                                str16 = str25;
                                str17 = str22;
                                str20 = str9;
                                str14 = strValueOf;
                                str15 = str6;
                                timeType2 = timeType;
                                str18 = str26;
                                str19 = str23;
                                str13 = str24;
                                tagWrapper = (TagWrapper) objM7386unboximpl;
                                i2 = i3;
                                C28897kjT c28897kjT102 = this.$moduleMetadata$inlined;
                                if (c28897kjT102 != null) {
                                }
                                C28897kjT c28897kjT112 = this.$moduleMetadata$inlined;
                                if (c28897kjT112 != null) {
                                }
                                boolean z22 = this.$isBoostModule$inlined;
                                ModuleBoostHeaderData moduleBoostHeaderData3 = this.$listedTokenData$inlined;
                                if (moduleBoostHeaderData3 != null) {
                                }
                                ModuleBoostHeaderData moduleBoostHeaderData22 = this.$listedTokenData$inlined;
                                if (moduleBoostHeaderData22 != null) {
                                }
                                objM7377constructorimpl = Result.m7377constructorimpl(new C28899kjV(i2 != 0 ? z : false, str19, str13, str18, str16, str17, str20, str14, str15, timeType2, str12, list, str11, shareLinkVO, tagWrapper, strCopydefault2, strEZpvd2, z22, carouselTokens, moduleBoostHeaderData22 != null ? moduleBoostHeaderData22.getCompetitionDeeplink() : null));
                                return Result.m7376boximpl(objM7377constructorimpl);
                            }
                        }
                        list = list4;
                        shareLinkVO = shareLinkVOIsConnected;
                        str11 = str3;
                        str12 = str5;
                        str13 = str7;
                        str14 = strValueOf;
                        str15 = str6;
                        timeType2 = timeType;
                        str16 = strEZpvd;
                        str17 = strCopydefault;
                        str18 = str10;
                        str19 = str8;
                        i2 = i10;
                        tagWrapper = null;
                        str20 = str9;
                        C28897kjT c28897kjT1022 = this.$moduleMetadata$inlined;
                        if (c28897kjT1022 != null) {
                        }
                        C28897kjT c28897kjT1122 = this.$moduleMetadata$inlined;
                        if (c28897kjT1122 != null) {
                        }
                        boolean z222 = this.$isBoostModule$inlined;
                        ModuleBoostHeaderData moduleBoostHeaderData32 = this.$listedTokenData$inlined;
                        if (moduleBoostHeaderData32 != null) {
                        }
                        ModuleBoostHeaderData moduleBoostHeaderData222 = this.$listedTokenData$inlined;
                        if (moduleBoostHeaderData222 != null) {
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(new C28899kjV(i2 != 0 ? z : false, str19, str13, str18, str16, str17, str20, str14, str15, timeType2, str12, list, str11, shareLinkVO, tagWrapper, strCopydefault2, strEZpvd2, z222, carouselTokens, moduleBoostHeaderData222 != null ? moduleBoostHeaderData222.getCompetitionDeeplink() : null));
                        return Result.m7376boximpl(objM7377constructorimpl);
                    }
                    HomeTokenData homeTokenData = (HomeTokenData) it.next();
                    String strKWHzl = homeTokenData.KWHzl();
                    if (strKWHzl.length() == 0) {
                        it2 = it;
                        strKWHzl = str2;
                    } else {
                        it2 = it;
                    }
                    Iterator it11 = this.$chainList$inlined.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            i4 = i;
                            next = null;
                            break;
                        }
                        next = it11.next();
                        Iterator it12 = it11;
                        i4 = i;
                        if (Intrinsics.EZpvd((Object) ((MarketChainBean) next).getChainId(), (Object) homeTokenData.KWHzl())) {
                            break;
                        }
                        i = i4;
                        it11 = it12;
                    }
                    MarketChainBean marketChainBean = (MarketChainBean) next;
                    String chainLogo = marketChainBean != null ? marketChainBean.getChainLogo() : null;
                    if (chainLogo == null) {
                        chainLogo = str4;
                    }
                    String strAkhnZx = homeTokenData.AkhnZx();
                    if (strAkhnZx.length() == 0) {
                        String str100 = str;
                        String strValues = homeTokenData.values();
                        String strIsConnected = homeTokenData.isConnected();
                        String strAuCTel3 = homeTokenData.AuCTel();
                        String strGEmmrt2 = homeTokenData.gEmmrt();
                        String strAEQbTJ2 = homeTokenData.AEQbTJ();
                        String strAYXKKw = homeTokenData.AYXKKw();
                        String strDbNXlk = homeTokenData.DbNXlk();
                        List<CompactTagData> listAhwBna = homeTokenData.AhwBna();
                        ArrayList arrayList2 = new ArrayList();
                        str59 = chainLogo;
                        str57 = str100;
                        str732 = str6;
                        it72 = listAhwBna.iterator();
                        str67 = str2;
                        str42 = strKWHzl;
                        str53 = strValues;
                        i8 = i4;
                        str54 = strIsConnected;
                        str742 = strAuCTel3;
                        str55 = strGEmmrt2;
                        str56 = strAEQbTJ2;
                        str58 = strAYXKKw;
                        str60 = strDbNXlk;
                        obj32 = objCopydefault;
                        collection5 = arrayList;
                        str752 = strEZpvd;
                        timeType5 = timeType;
                        it5 = it2;
                        str69 = strValueOf;
                        str71 = str3;
                        str68 = str9;
                        str61 = str5;
                        str762 = strCopydefault;
                        str64 = str10;
                        str65 = str8;
                        collection4 = collection5;
                        str66 = str;
                        collection72 = arrayList2;
                    } else {
                        String strValues2 = homeTokenData.values();
                        String strIsConnected2 = homeTokenData.isConnected();
                        String strAuCTel32 = homeTokenData.AuCTel();
                        String strGEmmrt22 = homeTokenData.gEmmrt();
                        String strAEQbTJ22 = homeTokenData.AEQbTJ();
                        String strAYXKKw2 = homeTokenData.AYXKKw();
                        String strDbNXlk2 = homeTokenData.DbNXlk();
                        List<CompactTagData> listAhwBna2 = homeTokenData.AhwBna();
                        ArrayList arrayList22 = new ArrayList();
                        str59 = chainLogo;
                        str57 = str100;
                        str732 = str6;
                        it72 = listAhwBna2.iterator();
                        str67 = str2;
                        str42 = strKWHzl;
                        str53 = strValues2;
                        i8 = i4;
                        str54 = strIsConnected2;
                        str742 = strAuCTel32;
                        str55 = strGEmmrt22;
                        str56 = strAEQbTJ22;
                        str58 = strAYXKKw2;
                        str60 = strDbNXlk2;
                        obj32 = objCopydefault;
                        collection5 = arrayList;
                        str752 = strEZpvd;
                        timeType5 = timeType;
                        it5 = it2;
                        str69 = strValueOf;
                        str71 = str3;
                        str68 = str9;
                        str61 = str5;
                        str762 = strCopydefault;
                        str64 = str10;
                        str65 = str8;
                        collection4 = collection5;
                        str66 = str;
                        collection72 = arrayList22;
                    }
                    if (it72.hasNext()) {
                    }
                }
            }
        }
    }
}
