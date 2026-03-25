package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.arG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7828arG extends AbstractC7846arY<java.lang.Boolean> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.AbstractC7846arY
    public /* synthetic */ java.lang.Boolean EZpvd(java.lang.String str, java.lang.Boolean bool) {
        return EZpvd(str, bool.booleanValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7828arG(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        super(str, str2, java.lang.Boolean.valueOf(z));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    public java.lang.Boolean EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.Boolean.valueOf(SPUtils.getBoolean(str, z, copydefault()));
    }
}
