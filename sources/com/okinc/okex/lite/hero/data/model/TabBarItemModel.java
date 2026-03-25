package com.okinc.okex.lite.hero.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TabBarItemModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String iconDay;
    public final String iconNight;
    public final int position;
    public final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TabBarItemModel copy$default(TabBarItemModel tabBarItemModel, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tabBarItemModel.title;
        }
        if ((i2 & 2) != 0) {
            str2 = tabBarItemModel.iconDay;
        }
        if ((i2 & 4) != 0) {
            str3 = tabBarItemModel.iconNight;
        }
        if ((i2 & 8) != 0) {
            i = tabBarItemModel.position;
        }
        return tabBarItemModel.copydefault(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.iconDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.iconNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TabBarItemModel copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TabBarItemModel(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabBarItemModel)) {
            return false;
        }
        TabBarItemModel tabBarItemModel = (TabBarItemModel) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) tabBarItemModel.title) && Intrinsics.EZpvd((Object) this.iconDay, (Object) tabBarItemModel.iconDay) && Intrinsics.EZpvd((Object) this.iconNight, (Object) tabBarItemModel.iconNight) && this.position == tabBarItemModel.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.iconDay.hashCode()) * 31) + this.iconNight.hashCode()) * 31) + Integer.hashCode(this.position);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TabBarItemModel(title=" + this.title + ", iconDay=" + this.iconDay + ", iconNight=" + this.iconNight + ", position=" + this.position + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.hero.data.model.TabBarItemModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TabBarItemModel> serializer() {
            return TabBarItemModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TabBarItemModel(int i, String str, String str2, String str3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, TabBarItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.iconDay = str2;
        this.iconNight = str3;
        this.position = i2;
    }

    public static final /* synthetic */ void AEQbTJ(TabBarItemModel tabBarItemModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tabBarItemModel.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tabBarItemModel.iconDay);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tabBarItemModel.iconNight);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, tabBarItemModel.position);
    }

    public TabBarItemModel(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.iconDay = str2;
        this.iconNight = str3;
        this.position = i;
    }
}
