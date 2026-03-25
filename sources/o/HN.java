package o;

import aws.smithy.kotlin.runtime.util.SystemDefaultProvider$readFileOrNull$1;
import aws.smithy.kotlin.runtime.util.SystemDefaultProvider$readFileOrNull$2;
import aws.smithy.kotlin.runtime.util.SystemDefaultProvider$writeFile$2;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.HK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HN implements HL {
    public static final HN EZpvd = new HN();
    public static final boolean AYXKKw = true;
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0<java.lang.Boolean>() { // from class: aws.smithy.kotlin.runtime.util.SystemDefaultProvider$isAndroid$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(HK.AEQbTJ());
        }
    });
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.util.SystemDefaultProvider$filePathSeparator$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return File.separator;
        }
    });

    private HN() {
    }

    @Override // o.HB
    public java.util.Map<java.lang.String, java.lang.String> copydefault() {
        java.util.Map<java.lang.String, java.lang.String> map = java.lang.System.getenv();
        Intrinsics.checkNotNullExpressionValue(map, "");
        return map;
    }

    @Override // o.HB
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.System.getenv().get(str);
    }

    @Override // o.HL
    public boolean AEQbTJ() {
        return ((java.lang.Boolean) AEQbTJ.getValue()).booleanValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.HK.KWHzl():o.HJ */
    @Override // o.HL
    public HJ EZpvd() {
        return HK.EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC5184Hy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super byte[]> continuation) throws java.lang.Throwable {
        SystemDefaultProvider$readFileOrNull$1 systemDefaultProvider$readFileOrNull$1;
        if (continuation instanceof SystemDefaultProvider$readFileOrNull$1) {
            systemDefaultProvider$readFileOrNull$1 = (SystemDefaultProvider$readFileOrNull$1) continuation;
            int i = systemDefaultProvider$readFileOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                systemDefaultProvider$readFileOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                systemDefaultProvider$readFileOrNull$1 = new SystemDefaultProvider$readFileOrNull$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = systemDefaultProvider$readFileOrNull$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = systemDefaultProvider$readFileOrNull$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                SystemDefaultProvider$readFileOrNull$2 systemDefaultProvider$readFileOrNull$2 = new SystemDefaultProvider$readFileOrNull$2(str, null);
                systemDefaultProvider$readFileOrNull$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, systemDefaultProvider$readFileOrNull$2, systemDefaultProvider$readFileOrNull$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            return (byte[]) objWithContext;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // o.InterfaceC5184Hy
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new SystemDefaultProvider$writeFile$2(str, bArr, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.HI
    public java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
        java.util.Set setEntrySet = java.lang.System.getProperties().entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Set<Map.Entry> set = setEntrySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(set, 10)), 16));
        for (Map.Entry entry : set) {
            Intrinsics.copydefault(entry);
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(entry.getKey().toString(), entry.getValue().toString());
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        return linkedHashMap;
    }

    @Override // o.HI
    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.System.getProperty(str);
    }

    @Override // o.InterfaceC5184Hy
    public java.lang.String KWHzl() {
        java.lang.Object value = KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (java.lang.String) value;
    }
}
