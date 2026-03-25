package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59242zdO extends AbstractC59331zey implements InterfaceC59380zfu, InterfaceC59378zfs {
    public abstract AbstractC59242zdO copydefault(@NotNull C59308zeb c59308zeb);

    public abstract AbstractC59242zdO copydefault(boolean z);

    public AbstractC59242zdO() {
        super(null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yXX.renderAnnotation$default(o.yXX, o.yOJ, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget, int, java.lang.Object):java.lang.String */
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<yOJ> it = copydefault().iterator();
        while (it.hasNext()) {
            C59446zhG.EZpvd(sb, "[", yXX.renderAnnotation$default(yXX.djBIcL, it.next(), null, 2, null), "] ");
        }
        sb.append(djBIcL());
        if (!bY_().isEmpty()) {
            CollectionsKt___CollectionsKt.joinTo$default(bY_(), sb, ", ", "<", ">", 0, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        }
        if (AEQbTJ()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
