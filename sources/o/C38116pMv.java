package o;

import com.okinc.lifecycle.impl.deeplink.usecase.H5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1;
import com.okinc.network.okg.response.ResponseData;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pMv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38116pMv implements InterfaceC38117pMw {
    public final Function1<java.lang.String, java.lang.Boolean> EZpvd;
    public final InterfaceC38106pMl KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    @yCM
    public C38116pMv(@NotNull InterfaceC38106pMl interfaceC38106pMl, @NotNull Function1<? super java.lang.String, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(interfaceC38106pMl, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = interfaceC38106pMl;
        this.EZpvd = function1;
        this.copydefault = "H5ApiResolver";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC38117pMw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super C38092pLy> continuation) throws java.lang.Throwable {
        H5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1 h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1;
        C38116pMv c38116pMv;
        if (continuation instanceof H5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1) {
            h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1 = (H5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1) continuation;
            int i = h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1.label = i - Integer.MIN_VALUE;
            } else {
                h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1 = new H5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC38106pMl interfaceC38106pMl = this.KWHzl;
            h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1.L$0 = this;
            h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1.L$1 = str;
            h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1.label = 1;
            objEZpvd = interfaceC38106pMl.EZpvd(h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c38116pMv = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1.L$1;
            c38116pMv = (C38116pMv) h5ToDeeplinkUseCaseImpl$getH5DeeplinkMapping$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.String>> mapKWHzl = (java.util.Map) ((ResponseData) objEZpvd).getData();
        if (mapKWHzl == null) {
            mapKWHzl = C56424yEw.KWHzl();
        }
        if (mapKWHzl.isEmpty()) {
            pUU.copydefault(c38116pMv.copydefault, "h5DeeplinkMappings is empty");
            return null;
        }
        C38092pLy c38092pLyEZpvd = c38116pMv.EZpvd(str, mapKWHzl);
        return c38092pLyEZpvd == null ? c38116pMv.AEQbTJ(str, mapKWHzl) : c38092pLyEZpvd;
    }

    public final C38092pLy AEQbTJ(java.lang.String str, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.String>> map) {
        for (java.lang.String str2 : StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null)) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
                if (this.EZpvd.invoke(str2).booleanValue()) {
                    return EZpvd(StringsKt__StringsKt.substringAfter$default(str, str2, (java.lang.String) null, 2, (java.lang.Object) null), map);
                }
                return null;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final C38092pLy EZpvd(java.lang.String str, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.String>> map) {
        if (map.containsKey(str)) {
            return new C38092pLy(str, map.getOrDefault(str, C56424yEw.KWHzl()).getOrDefault("deeplink", ""), map.getOrDefault(str, C56424yEw.KWHzl()).getOrDefault("dsl", ""));
        }
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null));
        C56404yEc.zsXlph(listFJNWhG);
        java.util.Iterator it = listFJNWhG.iterator();
        while (it.hasNext()) {
            str = StringsKt__StringsKt.substringBeforeLast$default(str, (java.lang.String) it.next(), (java.lang.String) null, 2, (java.lang.Object) null);
            if (map.containsKey(str)) {
                return new C38092pLy(str, map.getOrDefault(str, C56424yEw.KWHzl()).getOrDefault("deeplink", ""), map.getOrDefault(str, C56424yEw.KWHzl()).getOrDefault("dsl", ""));
            }
        }
        return null;
    }
}
