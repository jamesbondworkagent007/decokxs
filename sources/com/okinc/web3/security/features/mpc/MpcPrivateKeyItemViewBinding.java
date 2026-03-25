package com.okinc.web3.security.features.mpc;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewKt;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.web3.security.databinding.ItemMpcPrivateKeyBinding;
import com.okinc.web3.security.utils.LruCacheBitmapUtils;
import com.okinc.web3.security.utils.WrapApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C33070mpX;
import o.C43246rlf;
import o.C43312rms;
import o.C43318rmy;
import o.C52761wXj;
import o.C55296xhK;
import o.C56391yDq;
import o.C57407yho;
import o.C57659ymb;
import o.yCQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class MpcPrivateKeyItemViewBinding extends C43318rmy<MpcPrivateKeyItem, ItemMpcPrivateKeyBinding> {
    public static final int $stable = 8;
    private final LruCacheBitmapUtils drawableCacheUtils;
    private final Function1<Integer, Unit> onItemChanged;

    @Override // o.AbstractC43310rmq
    public /* bridge */ /* synthetic */ void onBindViewHolder(C43312rms c43312rms, Object obj) {
        onBindViewHolder((C43312rms<ItemMpcPrivateKeyBinding>) c43312rms, (MpcPrivateKeyItem) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MpcPrivateKeyItemViewBinding(@NotNull LruCacheBitmapUtils lruCacheBitmapUtils, @NotNull Function1<? super Integer, Unit> function1) {
        super(C57407yho.StateListAnimator.ejfBZ, 0);
        Intrinsics.checkNotNullParameter(lruCacheBitmapUtils, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.drawableCacheUtils = lruCacheBitmapUtils;
        this.onItemChanged = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    public void onBindViewHolder(@NotNull final C43312rms<ItemMpcPrivateKeyBinding> c43312rms, @NotNull final MpcPrivateKeyItem mpcPrivateKeyItem) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(mpcPrivateKeyItem, "");
        final ItemMpcPrivateKeyBinding itemMpcPrivateKeyBinding = (ItemMpcPrivateKeyBinding) c43312rms.OLrzqt();
        ImageView imageView = itemMpcPrivateKeyBinding.icon;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C57659ymb.copydefault(imageView, mpcPrivateKeyItem.getImageUrl(), C52761wXj.TaskDescription.aHXSQp, 1.0f, 32.0f);
        itemMpcPrivateKeyBinding.chainName.setText(mpcPrivateKeyItem.getChainName());
        itemMpcPrivateKeyBinding.tvCoinAddress.setText(mpcPrivateKeyItem.getAddress());
        itemMpcPrivateKeyBinding.tvPrivateKey.setText(WrapApi.dataUnwrap(C43246rlf.OLrzqt.valueOf(), mpcPrivateKeyItem.getPrivateKey()));
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = mpcPrivateKeyItem.getPrivateKeyContainerIsOpen();
        boolean privateKeyIsEye = mpcPrivateKeyItem.getPrivateKeyIsEye();
        itemMpcPrivateKeyBinding.iconEye.setVisibility(privateKeyIsEye ? 0 : 4);
        ImageView imageView2 = itemMpcPrivateKeyBinding.iconEyeClose;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        boolean z = !privateKeyIsEye;
        imageView2.setVisibility(z ? 0 : 8);
        ShapeableImageView shapeableImageView = itemMpcPrivateKeyBinding.privateKeyProtectMask;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        shapeableImageView.setVisibility(z ? 0 : 8);
        ConstraintLayout constraintLayout = itemMpcPrivateKeyBinding.privateKeyContainer;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(booleanRef.element ? 0 : 8);
        itemMpcPrivateKeyBinding.arrow.setRotation(booleanRef.element ? -180.0f : 0.0f);
        if (booleanRef.element && !privateKeyIsEye) {
            itemMpcPrivateKeyBinding.privateKeyContainer.post(new Runnable() { // from class: com.okinc.web3.security.features.mpc.MpcPrivateKeyItemViewBinding$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    MpcPrivateKeyItemViewBinding.onBindViewHolder$lambda$6$lambda$2(this.f$0, c43312rms, itemMpcPrivateKeyBinding);
                }
            });
        }
        final ImageView imageView3 = itemMpcPrivateKeyBinding.iconEye;
        final long j = 1000;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.mpc.MpcPrivateKeyItemViewBinding$onBindViewHolder$lambda$6$$inlined$singleClick$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(imageView3) > j || (imageView3 instanceof Checkable)) {
                    C55296xhK.OLrzqt(imageView3, jCurrentTimeMillis);
                    mpcPrivateKeyItem.setPrivateKeyIsEye(false);
                    this.onItemChanged.invoke(Integer.valueOf(c43312rms.getLayoutPosition()));
                }
            }
        });
        final ImageView imageView4 = itemMpcPrivateKeyBinding.iconEyeClose;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.mpc.MpcPrivateKeyItemViewBinding$onBindViewHolder$lambda$6$$inlined$singleClick$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(imageView4) > j || (imageView4 instanceof Checkable)) {
                    C55296xhK.OLrzqt(imageView4, jCurrentTimeMillis);
                    mpcPrivateKeyItem.setPrivateKeyIsEye(true);
                    this.onItemChanged.invoke(Integer.valueOf(c43312rms.getLayoutPosition()));
                }
            }
        });
        final ConstraintLayout constraintLayout2 = itemMpcPrivateKeyBinding.itemClickView;
        constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.mpc.MpcPrivateKeyItemViewBinding$onBindViewHolder$lambda$6$$inlined$singleClick$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(constraintLayout2) > j || (constraintLayout2 instanceof Checkable)) {
                    C55296xhK.OLrzqt(constraintLayout2, jCurrentTimeMillis);
                    mpcPrivateKeyItem.setPrivateKeyContainerIsOpen(!booleanRef.element);
                    this.onItemChanged.invoke(Integer.valueOf(c43312rms.getLayoutPosition()));
                    booleanRef.element = mpcPrivateKeyItem.getPrivateKeyContainerIsOpen();
                    View root = itemMpcPrivateKeyBinding.getRoot();
                    final Ref.BooleanRef booleanRef2 = booleanRef;
                    final ItemMpcPrivateKeyBinding itemMpcPrivateKeyBinding2 = itemMpcPrivateKeyBinding;
                    root.post(new Runnable() { // from class: com.okinc.web3.security.features.mpc.MpcPrivateKeyItemViewBinding$onBindViewHolder$1$4$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ObjectAnimator objectAnimatorOfFloat;
                            if (!booleanRef2.element) {
                                objectAnimatorOfFloat = ObjectAnimator.ofFloat(itemMpcPrivateKeyBinding2.arrow, Key.ROTATION, -180.0f, 0.0f);
                            } else {
                                objectAnimatorOfFloat = ObjectAnimator.ofFloat(itemMpcPrivateKeyBinding2.arrow, Key.ROTATION, 0.0f, -180.0f);
                            }
                            objectAnimatorOfFloat.setDuration(200L);
                            objectAnimatorOfFloat.start();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$6$lambda$2(final MpcPrivateKeyItemViewBinding mpcPrivateKeyItemViewBinding, final C43312rms c43312rms, final ItemMpcPrivateKeyBinding itemMpcPrivateKeyBinding) {
        try {
            Result.Application application = Result.Companion;
            BitmapDrawable bitmapFromMemoryCache = mpcPrivateKeyItemViewBinding.drawableCacheUtils.getBitmapFromMemoryCache(c43312rms.getLayoutPosition());
            if (bitmapFromMemoryCache != null) {
                itemMpcPrivateKeyBinding.privateKeyProtectMask.setImageDrawable(bitmapFromMemoryCache);
                return;
            }
            itemMpcPrivateKeyBinding.iconEye.setVisibility(4);
            itemMpcPrivateKeyBinding.privateKeyProtectMask.setImageDrawable(null);
            itemMpcPrivateKeyBinding.privateKeyBaseContainer.setBackground(C33070mpX.KWHzl(C57407yho.ActionBar.copydefault));
            ConstraintLayout constraintLayout = itemMpcPrivateKeyBinding.privateKeyBaseContainer;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            final Bitmap bitmapDrawToBitmap$default = ViewKt.drawToBitmap$default(constraintLayout, null, 1, null);
            yCQ.KWHzl(itemMpcPrivateKeyBinding.getRoot().getContext()).EZpvd(20).AEQbTJ(2).EZpvd(new yCQ.TaskDescription.StateListAnimator() { // from class: com.okinc.web3.security.features.mpc.MpcPrivateKeyItemViewBinding$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yCQ.TaskDescription.StateListAnimator
                public final void onImageReady(BitmapDrawable bitmapDrawable) {
                    MpcPrivateKeyItemViewBinding.onBindViewHolder$lambda$6$lambda$2$lambda$1$lambda$0(this.f$0, c43312rms, itemMpcPrivateKeyBinding, bitmapDrawToBitmap$default, bitmapDrawable);
                }
            }).AEQbTJ(bitmapDrawToBitmap$default).OLrzqt(itemMpcPrivateKeyBinding.privateKeyProtectMask);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$6$lambda$2$lambda$1$lambda$0(MpcPrivateKeyItemViewBinding mpcPrivateKeyItemViewBinding, C43312rms c43312rms, ItemMpcPrivateKeyBinding itemMpcPrivateKeyBinding, Bitmap bitmap, BitmapDrawable bitmapDrawable) {
        LruCacheBitmapUtils lruCacheBitmapUtils = mpcPrivateKeyItemViewBinding.drawableCacheUtils;
        int layoutPosition = c43312rms.getLayoutPosition();
        Intrinsics.copydefault(bitmapDrawable);
        lruCacheBitmapUtils.addBitmapToMemoryCache(layoutPosition, bitmapDrawable);
        itemMpcPrivateKeyBinding.privateKeyProtectMask.setImageDrawable(bitmapDrawable);
        ShapeableImageView shapeableImageView = itemMpcPrivateKeyBinding.privateKeyProtectMask;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        shapeableImageView.setVisibility(0);
        bitmap.recycle();
    }
}
