package com.okinc.productmatrix.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SceneInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SceneInfo> CREATOR = new Creator();
    private final Product product;
    private final ProductMatrixScene scene;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SceneInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SceneInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SceneInfo((ProductMatrixScene) parcel.readParcelable(SceneInfo.class.getClassLoader()), Product.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SceneInfo[] newArray(int i) {
            return new SceneInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SceneInfo copy$default(SceneInfo sceneInfo, ProductMatrixScene productMatrixScene, Product product, int i, Object obj) {
        if ((i & 1) != 0) {
            productMatrixScene = sceneInfo.scene;
        }
        if ((i & 2) != 0) {
            product = sceneInfo.product;
        }
        return sceneInfo.copy(productMatrixScene, product);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductMatrixScene component1() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Product component2() {
        return this.product;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SceneInfo copy(@NotNull ProductMatrixScene productMatrixScene, @NotNull Product product) {
        Intrinsics.checkNotNullParameter(productMatrixScene, "");
        Intrinsics.checkNotNullParameter(product, "");
        return new SceneInfo(productMatrixScene, product);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SceneInfo)) {
            return false;
        }
        SceneInfo sceneInfo = (SceneInfo) obj;
        return this.scene == sceneInfo.scene && Intrinsics.EZpvd(this.product, sceneInfo.product);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Product getProduct() {
        return this.product;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductMatrixScene getScene() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.scene.hashCode() * 31) + this.product.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SceneInfo(scene=" + this.scene + ", product=" + this.product + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.scene, i);
        this.product.writeToParcel(parcel, i);
    }

    public SceneInfo(@NotNull ProductMatrixScene productMatrixScene, @NotNull Product product) {
        Intrinsics.checkNotNullParameter(productMatrixScene, "");
        Intrinsics.checkNotNullParameter(product, "");
        this.scene = productMatrixScene;
        this.product = product;
    }
}
