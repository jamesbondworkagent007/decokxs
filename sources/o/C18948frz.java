package o;

import com.okinc.business.defi.wallet.mine.search.data.model.TagMetaData;
import com.okinc.business.defi.wallet.mine.search.data.repository.TagMetaRepository$fetchAllTagMetaData$1;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@yCR
public final class C18948frz {
    public final java.util.Map<java.lang.String, TagMetaData> EZpvd;
    public final C13934dbu KWHzl;

    @yCM
    public C18948frz(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.KWHzl = c13934dbu;
        this.EZpvd = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        TagMetaRepository$fetchAllTagMetaData$1 tagMetaRepository$fetchAllTagMetaData$1;
        C18948frz c18948frz;
        if (continuation instanceof TagMetaRepository$fetchAllTagMetaData$1) {
            tagMetaRepository$fetchAllTagMetaData$1 = (TagMetaRepository$fetchAllTagMetaData$1) continuation;
            int i = tagMetaRepository$fetchAllTagMetaData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagMetaRepository$fetchAllTagMetaData$1.label = i - Integer.MIN_VALUE;
            } else {
                tagMetaRepository$fetchAllTagMetaData$1 = new TagMetaRepository$fetchAllTagMetaData$1(this, continuation);
            }
        }
        java.lang.Object objAYXKKw = tagMetaRepository$fetchAllTagMetaData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagMetaRepository$fetchAllTagMetaData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAYXKKw);
                Result.Application application = Result.Companion;
                C13934dbu c13934dbu = this.KWHzl;
                tagMetaRepository$fetchAllTagMetaData$1.L$0 = this;
                tagMetaRepository$fetchAllTagMetaData$1.label = 1;
                objAYXKKw = c13934dbu.AYXKKw(tagMetaRepository$fetchAllTagMetaData$1);
                if (objAYXKKw == objCopydefault) {
                    return objCopydefault;
                }
                c18948frz = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c18948frz = (C18948frz) tagMetaRepository$fetchAllTagMetaData$1.L$0;
                C56391yDq.AEQbTJ(objAYXKKw);
            }
            java.util.List list = (java.util.List) ((AbstractC43419rot) objAYXKKw).copydefault();
            if (list != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
                for (java.lang.Object obj : list) {
                    linkedHashMap.put(((TagMetaData) obj).isConnected(), obj);
                }
                c18948frz.EZpvd.clear();
                c18948frz.EZpvd.putAll(linkedHashMap);
            }
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        try {
            Result.Application application = Result.Companion;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TagMetaData tagMetaData = this.EZpvd.get((java.lang.String) it.next());
                if (tagMetaData != null) {
                    arrayList.add(tagMetaData);
                }
            }
            return Result.m7377constructorimpl(arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final java.lang.Object copydefault() {
        try {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(java.lang.Boolean.valueOf(this.EZpvd.isEmpty()));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
