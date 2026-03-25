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
public final class HeroTabBarItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String iconDay;
    public final String iconDayRemote;
    public final String iconNight;
    public final String iconNightRemote;
    public final int position;
    public final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HeroTabBarItem copy$default(HeroTabBarItem heroTabBarItem, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = heroTabBarItem.title;
        }
        if ((i2 & 2) != 0) {
            str2 = heroTabBarItem.iconDay;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = heroTabBarItem.iconDayRemote;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = heroTabBarItem.iconNight;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = heroTabBarItem.iconNightRemote;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = heroTabBarItem.position;
        }
        return heroTabBarItem.copydefault(str, str6, str7, str8, str9, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.iconDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.iconDayRemote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.iconNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeroTabBarItem copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new HeroTabBarItem(str, str2, str3, str4, str5, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.iconNightRemote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroTabBarItem)) {
            return false;
        }
        HeroTabBarItem heroTabBarItem = (HeroTabBarItem) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) heroTabBarItem.title) && Intrinsics.EZpvd((Object) this.iconDay, (Object) heroTabBarItem.iconDay) && Intrinsics.EZpvd((Object) this.iconDayRemote, (Object) heroTabBarItem.iconDayRemote) && Intrinsics.EZpvd((Object) this.iconNight, (Object) heroTabBarItem.iconNight) && Intrinsics.EZpvd((Object) this.iconNightRemote, (Object) heroTabBarItem.iconNightRemote) && this.position == heroTabBarItem.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.iconDay.hashCode()) * 31) + this.iconDayRemote.hashCode()) * 31) + this.iconNight.hashCode()) * 31) + this.iconNightRemote.hashCode()) * 31) + Integer.hashCode(this.position);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HeroTabBarItem(title=" + this.title + ", iconDay=" + this.iconDay + ", iconDayRemote=" + this.iconDayRemote + ", iconNight=" + this.iconNight + ", iconNightRemote=" + this.iconNightRemote + ", position=" + this.position + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.hero.data.model.HeroTabBarItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HeroTabBarItem> serializer() {
            return HeroTabBarItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HeroTabBarItem(int i, String str, String str2, String str3, String str4, String str5, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, HeroTabBarItem$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.iconDay = str2;
        this.iconDayRemote = str3;
        this.iconNight = str4;
        this.iconNightRemote = str5;
        this.position = i2;
    }

    public static final /* synthetic */ void AEQbTJ(HeroTabBarItem heroTabBarItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, heroTabBarItem.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, heroTabBarItem.iconDay);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, heroTabBarItem.iconDayRemote);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, heroTabBarItem.iconNight);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, heroTabBarItem.iconNightRemote);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, heroTabBarItem.position);
    }

    public HeroTabBarItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.title = str;
        this.iconDay = str2;
        this.iconDayRemote = str3;
        this.iconNight = str4;
        this.iconNightRemote = str5;
        this.position = i;
    }
}
