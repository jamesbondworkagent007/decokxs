package o;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rkb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43189rkb implements Function2<android.content.Context, java.util.Map<java.lang.String, ? extends java.lang.Object>, java.lang.Boolean> {
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean invoke(@NotNull android.content.Context context, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        if ((!map.containsKey("isSupportDemoTrading") || C33129mqd.AhwBna(map.get("isSupportDemoTrading")) != 1) && C43173rkL.EZpvd.EZpvd()) {
            ((kOE) C43251rlk.copydefault(kOE.class)).KWHzl(context, "growth", map);
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
