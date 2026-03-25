package com.okinc.okex.feedback.net.bean;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class MainCategory {
    private ArrayList<ChildCategory> childrenList;
    private int id;
    private String name;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(ChildCategory$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.feedback.net.bean.MainCategory */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MainCategory copy$default(MainCategory mainCategory, String str, int i, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mainCategory.name;
        }
        if ((i2 & 2) != 0) {
            i = mainCategory.id;
        }
        if ((i2 & 4) != 0) {
            arrayList = mainCategory.childrenList;
        }
        return mainCategory.copy(str, i, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ChildCategory> component3() {
        return this.childrenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MainCategory copy(@NotNull String str, int i, @NotNull ArrayList<ChildCategory> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new MainCategory(str, i, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainCategory)) {
            return false;
        }
        MainCategory mainCategory = (MainCategory) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) mainCategory.name) && this.id == mainCategory.id && Intrinsics.EZpvd(this.childrenList, mainCategory.childrenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ChildCategory> getChildrenList() {
        return this.childrenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.id)) * 31) + this.childrenList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChildrenList(@NotNull ArrayList<ChildCategory> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.childrenList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(int i) {
        this.id = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MainCategory(name=" + this.name + ", id=" + this.id + ", childrenList=" + this.childrenList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.net.bean.MainCategory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MainCategory> serializer() {
            return MainCategory$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MainCategory(int i, String str, int i2, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, MainCategory$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.id = i2;
        this.childrenList = arrayList;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(MainCategory mainCategory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, mainCategory.name);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, mainCategory.id);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], mainCategory.childrenList);
    }

    public MainCategory(@NotNull String str, int i, @NotNull ArrayList<ChildCategory> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.name = str;
        this.id = i;
        this.childrenList = arrayList;
    }
}
