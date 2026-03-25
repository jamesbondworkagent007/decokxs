package o;

import com.fasterxml.jackson.core.JsonPointer;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.LinkedList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yWT implements yWS {
    public final ProtoBuf.StringTable EZpvd;
    public final ProtoBuf.QualifiedNameTable copydefault;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    public yWT(@NotNull ProtoBuf.StringTable stringTable, @NotNull ProtoBuf.QualifiedNameTable qualifiedNameTable) {
        Intrinsics.checkNotNullParameter(stringTable, "");
        Intrinsics.checkNotNullParameter(qualifiedNameTable, "");
        this.EZpvd = stringTable;
        this.copydefault = qualifiedNameTable;
    }

    @Override // o.yWS
    public java.lang.String KWHzl(int i) {
        java.lang.String string = this.EZpvd.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.yWS
    public java.lang.String OLrzqt(int i) {
        Triple<java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.Boolean> tripleEZpvd = EZpvd(i);
        java.util.List<java.lang.String> listComponent1 = tripleEZpvd.component1();
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(tripleEZpvd.component2(), JwtUtilsKt.JWT_DELIMITER, null, null, 0, null, null, 62, null);
        if (listComponent1.isEmpty()) {
            return strJoinToString$default;
        }
        return CollectionsKt___CollectionsKt.joinToString$default(listComponent1, "/", null, null, 0, null, null, 62, null) + JsonPointer.SEPARATOR + strJoinToString$default;
    }

    @Override // o.yWS
    public boolean copydefault(int i) {
        return EZpvd(i).getThird().booleanValue();
    }

    public final Triple<java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.Boolean> EZpvd(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.copydefault.getQualifiedName(i);
            java.lang.String string = this.EZpvd.getString(qualifiedName.getShortName());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            Intrinsics.copydefault(kind);
            int i2 = Activity.AEQbTJ[kind.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(string);
            } else if (i2 == 2) {
                linkedList.addFirst(string);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedList2.addFirst(string);
                z = true;
            }
            i = qualifiedName.getParentQualifiedName();
        }
        return new Triple<>(linkedList, linkedList2, java.lang.Boolean.valueOf(z));
    }
}
