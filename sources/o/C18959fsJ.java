package o;

import com.okinc.business.defi.wallet.mine.search.data.model.CompactTag;
import com.okinc.business.defi.wallet.mine.search.data.model.CompactTagData;
import com.okinc.business.defi.wallet.mine.search.data.model.TagMeta;
import com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper;
import com.okinc.business.defi.wallet.mine.search.ui.utils.TagUiUtils$getTagListForProfile$1;
import com.okinc.business.defi.wallet.mine.search.ui.utils.TagUiUtils$getTagListForSearch$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18959fsJ {
    public static final C18959fsJ OLrzqt = new C18959fsJ();

    private C18959fsJ() {
    }

    public static /* synthetic */ int getTextColor$default(C18959fsJ c18959fsJ, TagWrapper tagWrapper, boolean z, boolean z2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        return c18959fsJ.KWHzl(tagWrapper, z, z2, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int KWHzl(@NotNull TagWrapper tagWrapper, boolean z, boolean z2, java.lang.Integer num) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(tagWrapper, "");
        if (z) {
            if (z2) {
                TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
                strAYXKKw = tagMetaAEQbTJ != null ? tagMetaAEQbTJ.copydefault() : null;
            } else {
                TagMeta tagMetaAEQbTJ2 = tagWrapper.AEQbTJ();
                if (tagMetaAEQbTJ2 != null) {
                    strAYXKKw = tagMetaAEQbTJ2.KWHzl();
                }
            }
        } else if (z2) {
            TagMeta tagMetaAEQbTJ3 = tagWrapper.AEQbTJ();
            if (tagMetaAEQbTJ3 != null) {
                strAYXKKw = tagMetaAEQbTJ3.djBIcL();
            }
        } else {
            TagMeta tagMetaAEQbTJ4 = tagWrapper.AEQbTJ();
            if (tagMetaAEQbTJ4 != null) {
                strAYXKKw = tagMetaAEQbTJ4.AYXKKw();
            }
        }
        return C33070mpX.EZpvd(strAYXKKw != null ? strAYXKKw : "", num != null ? num.intValue() : C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
    }

    public static /* synthetic */ java.lang.String getIcon$default(C18959fsJ c18959fsJ, TagMeta tagMeta, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return c18959fsJ.EZpvd(tagMeta, z, z2);
    }

    public final java.lang.String EZpvd(@NotNull TagMeta tagMeta, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(tagMeta, "");
        return z ? z2 ? tagMeta.EZpvd() : tagMeta.OLrzqt() : z2 ? tagMeta.gEmmrt() : tagMeta.valueOf();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0078 -> B:21:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<CompactTagData> list, @NotNull C18913frQ c18913frQ, @NotNull Continuation<? super java.util.List<TagWrapper>> continuation) throws java.lang.Throwable {
        TagUiUtils$getTagListForSearch$1 tagUiUtils$getTagListForSearch$1;
        java.util.Iterator it;
        java.util.Collection collection;
        C18913frQ c18913frQ2;
        if (continuation instanceof TagUiUtils$getTagListForSearch$1) {
            tagUiUtils$getTagListForSearch$1 = (TagUiUtils$getTagListForSearch$1) continuation;
            int i = tagUiUtils$getTagListForSearch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagUiUtils$getTagListForSearch$1.label = i - Integer.MIN_VALUE;
            } else {
                tagUiUtils$getTagListForSearch$1 = new TagUiUtils$getTagListForSearch$1(this, continuation);
            }
        }
        java.lang.Object obj = tagUiUtils$getTagListForSearch$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagUiUtils$getTagListForSearch$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            it = list.iterator();
            collection = arrayList;
            c18913frQ2 = c18913frQ;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (java.util.Collection) tagUiUtils$getTagListForSearch$1.L$3;
            it = (java.util.Iterator) tagUiUtils$getTagListForSearch$1.L$2;
            java.util.Collection collection2 = (java.util.Collection) tagUiUtils$getTagListForSearch$1.L$1;
            C18913frQ c18913frQ3 = (C18913frQ) tagUiUtils$getTagListForSearch$1.L$0;
            C56391yDq.AEQbTJ(obj);
            collection.add((TagWrapper) obj);
            collection = collection2;
            c18913frQ2 = c18913frQ3;
            if (it.hasNext()) {
                CompactTag compactTagOLrzqt = C18905frI.OLrzqt((CompactTagData) it.next());
                tagUiUtils$getTagListForSearch$1.L$0 = c18913frQ2;
                tagUiUtils$getTagListForSearch$1.L$1 = collection;
                tagUiUtils$getTagListForSearch$1.L$2 = it;
                tagUiUtils$getTagListForSearch$1.L$3 = collection;
                tagUiUtils$getTagListForSearch$1.label = 1;
                java.lang.Object objKWHzl = C18905frI.KWHzl(compactTagOLrzqt, c18913frQ2, tagUiUtils$getTagListForSearch$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c18913frQ3 = c18913frQ2;
                obj = objKWHzl;
                collection2 = collection;
                collection.add((TagWrapper) obj);
                collection = collection2;
                c18913frQ2 = c18913frQ3;
                if (it.hasNext()) {
                    return (java.util.List) collection;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a2 -> B:27:0x00a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<CompactTagData> list, @NotNull C18913frQ c18913frQ, @NotNull Continuation<? super java.util.List<TagWrapper>> continuation) throws java.lang.Throwable {
        TagUiUtils$getTagListForProfile$1 tagUiUtils$getTagListForProfile$1;
        java.util.Collection arrayList;
        C18913frQ c18913frQ2;
        java.util.Iterator it;
        if (continuation instanceof TagUiUtils$getTagListForProfile$1) {
            tagUiUtils$getTagListForProfile$1 = (TagUiUtils$getTagListForProfile$1) continuation;
            int i = tagUiUtils$getTagListForProfile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagUiUtils$getTagListForProfile$1.label = i - Integer.MIN_VALUE;
            } else {
                tagUiUtils$getTagListForProfile$1 = new TagUiUtils$getTagListForProfile$1(this, continuation);
            }
        }
        java.lang.Object obj = tagUiUtils$getTagListForProfile$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagUiUtils$getTagListForProfile$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (C18957fsH.KWHzl.KWHzl().contains(((CompactTagData) obj2).AEQbTJ())) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            java.util.Iterator it2 = arrayList2.iterator();
            c18913frQ2 = c18913frQ;
            it = it2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (java.util.Collection) tagUiUtils$getTagListForProfile$1.L$3;
            it = (java.util.Iterator) tagUiUtils$getTagListForProfile$1.L$2;
            java.util.Collection collection = (java.util.Collection) tagUiUtils$getTagListForProfile$1.L$1;
            C18913frQ c18913frQ3 = (C18913frQ) tagUiUtils$getTagListForProfile$1.L$0;
            C56391yDq.AEQbTJ(obj);
            arrayList.add((TagWrapper) obj);
            arrayList = collection;
            c18913frQ2 = c18913frQ3;
            if (it.hasNext()) {
                CompactTag compactTagOLrzqt = C18905frI.OLrzqt((CompactTagData) it.next());
                tagUiUtils$getTagListForProfile$1.L$0 = c18913frQ2;
                tagUiUtils$getTagListForProfile$1.L$1 = arrayList;
                tagUiUtils$getTagListForProfile$1.L$2 = it;
                tagUiUtils$getTagListForProfile$1.L$3 = arrayList;
                tagUiUtils$getTagListForProfile$1.label = 1;
                java.lang.Object objKWHzl = C18905frI.KWHzl(compactTagOLrzqt, c18913frQ2, tagUiUtils$getTagListForProfile$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c18913frQ3 = c18913frQ2;
                obj = objKWHzl;
                collection = arrayList;
                arrayList.add((TagWrapper) obj);
                arrayList = collection;
                c18913frQ2 = c18913frQ3;
                if (it.hasNext()) {
                    return (java.util.List) arrayList;
                }
            }
        }
    }
}
