package com.okinc.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.share.bean.MultiShareConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48907ueY;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class MultiShareConfig implements Parcelable {
    public static final int MAX_LIST_SIZE = 6;
    private final ArrayList<ShareConfig> configList;
    private boolean isLoop;
    private Class<? extends AbstractC48907ueY> multiSharedPreviewFragmentClass;
    private float pageWidthPercent;
    private boolean showIndicator;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MultiShareConfig> CREATOR = new Parcelable.Creator<MultiShareConfig>() { // from class: com.okinc.share.bean.MultiShareConfig$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MultiShareConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MultiShareConfig(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MultiShareConfig[] newArray(int i) {
            return new MultiShareConfig[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.MultiShareConfig.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MultiShareConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ShareConfig> getConfigList() {
        return this.configList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Class<? extends AbstractC48907ueY> getMultiSharedPreviewFragmentClass() {
        return this.multiSharedPreviewFragmentClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getPageWidthPercent() {
        return this.pageWidthPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowIndicator() {
        return this.showIndicator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLoop() {
        return this.isLoop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoop(boolean z) {
        this.isLoop = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMultiSharedPreviewFragmentClass(Class<? extends AbstractC48907ueY> cls) {
        this.multiSharedPreviewFragmentClass = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageWidthPercent(float f) {
        this.pageWidthPercent = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowIndicator(boolean z) {
        this.showIndicator = z;
    }

    private MultiShareConfig() {
        this.configList = new ArrayList<>();
        this.pageWidthPercent = 1.0f;
        this.showIndicator = true;
    }

    /* JADX DEBUG: Type inference failed for r5v2. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Object, java.lang.Class<? extends o.ueY> */
    public MultiShareConfig(@NotNull Parcel parcel) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<ShareConfig> arrayList = new ArrayList<>();
        this.configList = arrayList;
        this.pageWidthPercent = 1.0f;
        this.showIndicator = true;
        parcel.readTypedList(arrayList, ShareConfig.CREATOR);
        this.isLoop = parcel.readByte() != 0;
        this.pageWidthPercent = parcel.readFloat();
        String string = parcel.readString();
        if (string == null || string.length() == 0) {
            return;
        }
        Class cls = Class.forName(string);
        Intrinsics.copydefault(cls, "");
        this.multiSharedPreviewFragmentClass = cls;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeTypedList(this.configList);
        parcel.writeByte(this.isLoop ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.pageWidthPercent);
        Class<? extends AbstractC48907ueY> cls = this.multiSharedPreviewFragmentClass;
        parcel.writeString(cls != null ? cls.getName() : null);
    }

    public final ShareConfig getFirstShareConfig() {
        return (ShareConfig) CollectionsKt___CollectionsKt.AuCTelauCTel(this.configList);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.MultiShareConfig.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static final Unit copydefault(MultiShareConfig multiShareConfig) {
            Intrinsics.checkNotNullParameter(multiShareConfig, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.share.bean.MultiShareConfig$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultiShareConfig create$default(ActionBar actionBar, List list, boolean z, float f, boolean z2, Class cls, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                f = 1.0f;
            }
            float f2 = f;
            if ((i & 8) != 0) {
                z2 = true;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                cls = null;
            }
            Class cls2 = cls;
            if ((i & 32) != 0) {
                function1 = new Function1() { // from class: o.ufx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return MultiShareConfig.ActionBar.copydefault((MultiShareConfig) obj2);
                    }
                };
            }
            return actionBar.OLrzqt(list, z3, f2, z4, cls2, function1);
        }

        public final MultiShareConfig OLrzqt(@NotNull List<ShareConfig> list, boolean z, float f, boolean z2, Class<? extends AbstractC48907ueY> cls, @NotNull Function1<? super MultiShareConfig, Unit> function1) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            MultiShareConfig multiShareConfig = new MultiShareConfig((DefaultConstructorMarker) null);
            multiShareConfig.getConfigList().addAll(list.subList(0, Math.min(6, list.size())));
            multiShareConfig.setLoop(z);
            multiShareConfig.setPageWidthPercent(f);
            multiShareConfig.setShowIndicator(z2);
            multiShareConfig.setMultiSharedPreviewFragmentClass(cls);
            function1.invoke(multiShareConfig);
            return multiShareConfig;
        }

        public final Pair<Boolean, String> EZpvd(@NotNull MultiShareConfig multiShareConfig) {
            Intrinsics.checkNotNullParameter(multiShareConfig, "");
            ArrayList<ShareConfig> configList = multiShareConfig.getConfigList();
            if (configList.isEmpty()) {
                return new Pair<>(Boolean.FALSE, "configList can not be empty");
            }
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(configList, 10));
            Iterator<T> it = configList.iterator();
            while (it.hasNext()) {
                arrayList.add(((ShareConfig) it.next()).getShareParams().getShareType());
            }
            return CollectionsKt___CollectionsKt.QbewEr(arrayList).size() > 1 ? new Pair<>(Boolean.FALSE, "ShareParams's shareType must be same") : (((ShareConfig) CollectionsKt___CollectionsKt.AuCTelauCTel(configList)).getShareParams().getShareType() == ShareType.SHARE_IMAGE || configList.size() <= 1) ? new Pair<>(Boolean.TRUE, "") : new Pair<>(Boolean.FALSE, "multi shareConfig only support ShareType.SHARE_IMAGE now");
        }
    }
}
