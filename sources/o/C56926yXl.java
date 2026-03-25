package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56926yXl extends C56925yXk {
    public final JvmProtoBuf.StringTableTypes OLrzqt;

    /* JADX WARN: Illegal instructions before constructor call */
    public C56926yXl(@NotNull JvmProtoBuf.StringTableTypes stringTableTypes, @NotNull java.lang.String[] strArr) {
        java.util.Set setOqFWZa;
        Intrinsics.checkNotNullParameter(stringTableTypes, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        java.util.List<java.lang.Integer> localNameList = stringTableTypes.getLocalNameList();
        if (localNameList.isEmpty()) {
            setOqFWZa = yEE.copydefault();
        } else {
            Intrinsics.copydefault(localNameList);
            setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(localNameList);
        }
        java.util.List<JvmProtoBuf.StringTableTypes.Record> recordList = stringTableTypes.getRecordList();
        Intrinsics.checkNotNullExpressionValue(recordList, "");
        super(strArr, setOqFWZa, C56924yXj.copydefault(recordList));
        this.OLrzqt = stringTableTypes;
    }
}
