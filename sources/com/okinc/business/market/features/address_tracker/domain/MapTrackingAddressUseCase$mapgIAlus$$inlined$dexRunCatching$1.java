package com.okinc.business.market.features.address_tracker.domain;

import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.TrackingAddressData;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27634jyr;
import o.C29712kyn;
import o.C56391yDq;
import o.C56442yFn;
import o.jAN;
import o.jAZ;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.MapTrackingAddressUseCase$map-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class MapTrackingAddressUseCase$mapgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends jAZ>>, Object> {
    final /* synthetic */ TrackingAddressData $from$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jAN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapTrackingAddressUseCase$mapgIAlus$$inlined$dexRunCatching$1(Continuation continuation, TrackingAddressData trackingAddressData, jAN jan) {
        super(2, continuation);
        this.$from$inlined = trackingAddressData;
        this.this$0 = jan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapTrackingAddressUseCase$mapgIAlus$$inlined$dexRunCatching$1(continuation, this.$from$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends jAZ>> continuation) {
        return ((MapTrackingAddressUseCase$mapgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: all -> 0x012b, CancellationException -> 0x0142, TryCatch #2 {CancellationException -> 0x0142, all -> 0x012b, blocks: (B:7:0x0016, B:32:0x00b4, B:36:0x00cd, B:40:0x00e6, B:44:0x0111, B:12:0x002f, B:22:0x008a, B:25:0x0091, B:16:0x0053, B:18:0x0059, B:28:0x0099, B:27:0x0095, B:15:0x0040), top: B:52:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095 A[Catch: all -> 0x012b, CancellationException -> 0x0142, TryCatch #2 {CancellationException -> 0x0142, all -> 0x012b, blocks: (B:7:0x0016, B:32:0x00b4, B:36:0x00cd, B:40:0x00e6, B:44:0x0111, B:12:0x002f, B:22:0x008a, B:25:0x0091, B:16:0x0053, B:18:0x0059, B:28:0x0099, B:27:0x0095, B:15:0x0040), top: B:52:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[Catch: all -> 0x012b, CancellationException -> 0x0142, TryCatch #2 {CancellationException -> 0x0142, all -> 0x012b, blocks: (B:7:0x0016, B:32:0x00b4, B:36:0x00cd, B:40:0x00e6, B:44:0x0111, B:12:0x002f, B:22:0x008a, B:25:0x0091, B:16:0x0053, B:18:0x0059, B:28:0x0099, B:27:0x0095, B:15:0x0040), top: B:52:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0086 -> B:22:0x008a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Iterator it;
        Collection collection;
        Object emojiAddressMapping$default;
        List list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            List<CompactTagData> listAhwBna = this.$from$inlined.AhwBna();
            ArrayList arrayList = new ArrayList();
            it = listAhwBna.iterator();
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list2 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                emojiAddressMapping$default = obj;
                list = list2;
                Map map = (Map) emojiAddressMapping$default;
                String strAEQbTJ = this.$from$inlined.AEQbTJ();
                StringBooleanType stringBooleanTypeGEmmrt = this.$from$inlined.gEmmrt();
                StringBooleanType stringBooleanType = StringBooleanType.TRUE;
                objM7377constructorimpl = Result.m7377constructorimpl(new jAZ(strAEQbTJ, stringBooleanTypeGEmmrt != stringBooleanType, this.$from$inlined.isConnected(), this.$from$inlined.DbNXlk(), this.$from$inlined.values() != stringBooleanType, this.$from$inlined.KWHzl(), this.$from$inlined.AYXKKw(), this.$from$inlined.valueOf(), this.$from$inlined.fetchVPNInfo(), this.$from$inlined.AkhnZx(), this.$from$inlined.EZpvd() != stringBooleanType, list, (String) map.getOrDefault(this.$from$inlined.isConnected(), "")));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            Iterator it2 = (Iterator) this.L$1;
            Collection collection2 = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objEZpvd = ((Result) obj).m7386unboximpl();
            it = it2;
            collection = collection2;
            if (Result.m7383isFailureimpl(objEZpvd)) {
                objEZpvd = null;
            }
            TagWrapper tagWrapper = (TagWrapper) objEZpvd;
            if (tagWrapper != null) {
                collection.add(tagWrapper);
            }
            if (it.hasNext()) {
                CompactTagData compactTagData = (CompactTagData) it.next();
                C29712kyn c29712kyn = this.this$0.KWHzl;
                this.L$0 = collection;
                this.L$1 = it;
                this.label = 1;
                Collection collection3 = collection;
                Iterator it3 = it;
                objEZpvd = c29712kyn.EZpvd(compactTagData, (62 & 2) != 0 ? null : null, (62 & 4) != 0 ? null : null, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) != 0 ? null : null, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                it = it3;
                collection = collection3;
                if (Result.m7383isFailureimpl(objEZpvd)) {
                }
                TagWrapper tagWrapper2 = (TagWrapper) objEZpvd;
                if (tagWrapper2 != null) {
                }
                if (it.hasNext()) {
                    List list3 = (List) collection;
                    C27634jyr c27634jyr = this.this$0.copydefault;
                    this.L$0 = list3;
                    this.L$1 = null;
                    this.label = 2;
                    emojiAddressMapping$default = C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, this, 1, null);
                    if (emojiAddressMapping$default == objCopydefault) {
                        return objCopydefault;
                    }
                    list = list3;
                    Map map2 = (Map) emojiAddressMapping$default;
                    String strAEQbTJ2 = this.$from$inlined.AEQbTJ();
                    StringBooleanType stringBooleanTypeGEmmrt2 = this.$from$inlined.gEmmrt();
                    StringBooleanType stringBooleanType2 = StringBooleanType.TRUE;
                    objM7377constructorimpl = Result.m7377constructorimpl(new jAZ(strAEQbTJ2, stringBooleanTypeGEmmrt2 != stringBooleanType2, this.$from$inlined.isConnected(), this.$from$inlined.DbNXlk(), this.$from$inlined.values() != stringBooleanType2, this.$from$inlined.KWHzl(), this.$from$inlined.AYXKKw(), this.$from$inlined.valueOf(), this.$from$inlined.fetchVPNInfo(), this.$from$inlined.AkhnZx(), this.$from$inlined.EZpvd() != stringBooleanType2, list, (String) map2.getOrDefault(this.$from$inlined.isConnected(), "")));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        }
    }
}
