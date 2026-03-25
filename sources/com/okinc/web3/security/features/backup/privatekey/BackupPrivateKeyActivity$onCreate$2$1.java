package com.okinc.web3.security.features.backup.privatekey;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewKt;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.okinc.web3.security.databinding.ItemBackupPrivateKeyBinding;
import com.okinc.web3.security.features.backup.privatekey.CopyPrivateKeyProtectFragment;
import com.okinc.web3.security.model.PrivateKeyInfo;
import com.okinc.web3.security.utils.LruCacheBitmapUtils;
import com.okinc.web3.security.utils.WrapApi;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C43246rlf;
import o.C43312rms;
import o.C43318rmy;
import o.C52761wXj;
import o.C52794wYp;
import o.C55251xgS;
import o.C55296xhK;
import o.C55298xhM;
import o.C56391yDq;
import o.C57407yho;
import o.C57440yiU;
import o.C57659ymb;
import o.ViewOnClickListenerC54939xaY;
import o.yCQ;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class BackupPrivateKeyActivity$onCreate$2$1 extends C43318rmy<PrivateKeyInfo, ItemBackupPrivateKeyBinding> {
    final /* synthetic */ BackupPrivateKeyActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupPrivateKeyActivity$onCreate$2$1(BackupPrivateKeyActivity backupPrivateKeyActivity, int i, int i2) {
        super(i, i2);
        this.this$0 = backupPrivateKeyActivity;
    }

    @Override // o.AbstractC43310rmq
    public /* bridge */ /* synthetic */ void onBindViewHolder(C43312rms c43312rms, Object obj) {
        onBindViewHolder((C43312rms<ItemBackupPrivateKeyBinding>) c43312rms, (PrivateKeyInfo) obj);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    public void onBindViewHolder(final C43312rms<ItemBackupPrivateKeyBinding> c43312rms, final PrivateKeyInfo privateKeyInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(privateKeyInfo, "");
        super.onBindViewHolder((C43312rms) c43312rms, privateKeyInfo);
        ImageView imageView = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).ivIcon;
        Intrinsics.copydefault(imageView);
        C57659ymb.loadFixSizeBorderImage$default(imageView, privateKeyInfo.getChainUrl(), C52761wXj.TaskDescription.aHXSQp, 0.0f, 32.0f, 4, null);
        final TextView textView = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).tvChainName;
        textView.setText(privateKeyInfo.getChainName());
        final long j = 1000;
        if (privateKeyInfo.getShowChainInfo()) {
            textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(6, (Context) null, 1, (Object) null));
            Drawable drawable = ContextCompat.getDrawable(textView.getContext(), C52761wXj.TaskDescription.gqOnQv);
            if (drawable != null) {
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iOLrzqt = C55298xhM.OLrzqt(16, context);
                Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context2));
                drawable.setTint(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DCUTEIddSDPG));
                Unit unit = Unit.INSTANCE;
            } else {
                drawable = null;
            }
            textView.setCompoundDrawablesRelative(null, null, drawable, null);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity$onCreate$2$1$onBindViewHolder$lambda$4$$inlined$singleClick$default$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(textView) > j || (textView instanceof Checkable)) {
                        C55296xhK.OLrzqt(textView, jCurrentTimeMillis);
                        Context context3 = ((TextView) textView).getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "");
                        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context3);
                        viewOnClickListenerC54939xaY.EZpvd(privateKeyInfo.getChainInfoText());
                        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C57407yho.Activity.wlaJM, (View.OnClickListener) null, 2, (Object) null);
                        viewOnClickListenerC54939xaY.show();
                    }
                }
            });
        } else {
            textView.setCompoundDrawablesRelative(null, null, null, null);
            textView.setOnClickListener(null);
        }
        C55251xgS c55251xgS = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).tagAddress;
        Intrinsics.copydefault(c55251xgS);
        String chainAddressTypeText = privateKeyInfo.getChainAddressTypeText();
        c55251xgS.setVisibility((chainAddressTypeText == null || chainAddressTypeText.length() == 0) ^ true ? 0 : 8);
        c55251xgS.setText(privateKeyInfo.getChainAddressTypeText());
        ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).tvCoinAddress.setText(privateKeyInfo.getChainAddress());
        C57440yiU c57440yiU = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).plIconList;
        Intrinsics.copydefault(c57440yiU);
        c57440yiU.setVisibility(privateKeyInfo.isShowSupportChains() ? 0 : 8);
        c57440yiU.removeAllViews();
        if (privateKeyInfo.isShowSupportChains()) {
            int i = C52761wXj.TaskDescription.aHXSQp;
            List<Integer> supportChainShowIconResIds = privateKeyInfo.getSupportChainShowIconResIds();
            if (supportChainShowIconResIds == null) {
                supportChainShowIconResIds = yDY.AhwBna();
            }
            Iterator<Integer> it = supportChainShowIconResIds.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                ShapeableImageView shapeableImageView = new ShapeableImageView(c57440yiU.getContext());
                Context context3 = shapeableImageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                int iOLrzqt2 = C55298xhM.OLrzqt(20, context3);
                Context context4 = shapeableImageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                shapeableImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(iOLrzqt2, C55298xhM.OLrzqt(20, context4)));
                shapeableImageView.setShapeAppearanceModel(new ShapeAppearanceModel.Builder().build());
                shapeableImageView.setImageTintList(ContextCompat.getColorStateList(shapeableImageView.getContext(), C52761wXj.Activity.UlJrfe));
                Glide.KWHzl(c57440yiU).OLrzqt(Integer.valueOf(iIntValue)).AEQbTJ(i).KWHzl(i).copydefault(i).EZpvd((ImageView) shapeableImageView);
                c57440yiU.addView(shapeableImageView);
            }
        }
        C55251xgS c55251xgS2 = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).tagCount;
        Intrinsics.copydefault(c55251xgS2);
        c55251xgS2.setVisibility(privateKeyInfo.isShowSupportChains() ? 0 : 8);
        int size = privateKeyInfo.getSupportChainAllIds().size();
        List<Integer> supportChainShowIconResIds2 = privateKeyInfo.getSupportChainShowIconResIds();
        c55251xgS2.setText("+ " + (size - (supportChainShowIconResIds2 != null ? supportChainShowIconResIds2.size() : 0)));
        final AppCompatImageView appCompatImageView = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).ivArrow;
        final BackupPrivateKeyActivity backupPrivateKeyActivity = this.this$0;
        if (privateKeyInfo.isExpand()) {
            appCompatImageView.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
        } else {
            appCompatImageView.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
        }
        final long j2 = 100;
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity$onCreate$2$1$onBindViewHolder$lambda$12$$inlined$singleClick$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(appCompatImageView) > j2 || (appCompatImageView instanceof Checkable)) {
                    C55296xhK.OLrzqt(appCompatImageView, jCurrentTimeMillis);
                    privateKeyInfo.setExpand(!r7.isExpand());
                    privateKeyInfo.setShowed(false);
                    backupPrivateKeyActivity.getMAdapter().notifyItemChanged(c43312rms.getLayoutPosition());
                    if (privateKeyInfo.isExpand()) {
                        int itemCount = backupPrivateKeyActivity.getMAdapter().getItemCount();
                        for (int i2 = 0; i2 < itemCount; i2++) {
                            if (i2 != c43312rms.getLayoutPosition()) {
                                PrivateKeyInfo privateKeyInfo2 = (PrivateKeyInfo) backupPrivateKeyActivity.getMAdapter().AEQbTJ(i2);
                                if (privateKeyInfo2.isExpand()) {
                                    privateKeyInfo2.setExpand(false);
                                    privateKeyInfo2.setShowed(false);
                                    backupPrivateKeyActivity.getMAdapter().notifyItemChanged(i2);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        });
        Group group = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).bottomViewGroup;
        Intrinsics.copydefault(group);
        group.setVisibility(privateKeyInfo.isExpand() ? 0 : 8);
        final TextView textView2 = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).tvPrivateKey;
        final BackupPrivateKeyActivity backupPrivateKeyActivity2 = this.this$0;
        textView2.setText(WrapApi.dataUnwrap(C43246rlf.OLrzqt.valueOf(), privateKeyInfo.getPrivateKey()));
        final long j3 = 100;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity$onCreate$2$1$onBindViewHolder$lambda$15$$inlined$singleClick$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(textView2) > j3 || (textView2 instanceof Checkable)) {
                    C55296xhK.OLrzqt(textView2, jCurrentTimeMillis);
                    privateKeyInfo.setShowed(!r7.isShowed());
                    if (privateKeyInfo.isShowed()) {
                        backupPrivateKeyActivity2.getWindow().setFlags(8192, 8192);
                    } else {
                        backupPrivateKeyActivity2.getWindow().clearFlags(8192);
                    }
                    backupPrivateKeyActivity2.getMAdapter().notifyItemChanged(c43312rms.getLayoutPosition());
                }
            }
        });
        final ShapeableImageView shapeableImageView2 = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).sivPrivateKeyProtectMask;
        final BackupPrivateKeyActivity backupPrivateKeyActivity3 = this.this$0;
        Intrinsics.copydefault(shapeableImageView2);
        shapeableImageView2.setVisibility((privateKeyInfo.isShowed() || !privateKeyInfo.isExpand()) ? 8 : 0);
        shapeableImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity$onCreate$2$1$onBindViewHolder$lambda$20$$inlined$singleClick$default$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(shapeableImageView2) > j || (shapeableImageView2 instanceof Checkable)) {
                    C55296xhK.OLrzqt(shapeableImageView2, jCurrentTimeMillis);
                    ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).tvPrivateKey.performClick();
                }
            }
        });
        shapeableImageView2.setImageResource(C57407yho.ActionBar.gEmmrt);
        shapeableImageView2.post(new Runnable() { // from class: com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity$onCreate$2$1$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                BackupPrivateKeyActivity$onCreate$2$1.onBindViewHolder$lambda$20$lambda$19(backupPrivateKeyActivity3, c43312rms, shapeableImageView2);
            }
        });
        final Group group2 = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).maskGroup;
        Intrinsics.copydefault(group2);
        group2.setVisibility((privateKeyInfo.isShowed() || !privateKeyInfo.isExpand()) ? 8 : 0);
        final long j4 = 100;
        group2.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity$onCreate$2$1$onBindViewHolder$lambda$22$$inlined$singleClick$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(group2) > j4 || (group2 instanceof Checkable)) {
                    C55296xhK.OLrzqt(group2, jCurrentTimeMillis);
                    ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).tvPrivateKey.performClick();
                }
            }
        });
        final C52794wYp c52794wYp = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).obCopy;
        final BackupPrivateKeyActivity backupPrivateKeyActivity4 = this.this$0;
        c52794wYp.setText(C33070mpX.AYXKKw(C57407yho.Activity.AkhnZx));
        Drawable drawable2 = ContextCompat.getDrawable(c52794wYp.getContext(), C52761wXj.TaskDescription.DcNNRp);
        if (drawable2 != null) {
            drawable2.setTint(ContextCompat.getColor(c52794wYp.getContext(), C52761wXj.Activity.htlTjW));
        }
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, C55298xhM.dpInt$default(16.0f, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(16.0f, (Context) null, 1, (Object) null));
        }
        c52794wYp.setCompoundDrawablesRelative(drawable2, null, null, null);
        final long j5 = 1000;
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity$onCreate$2$1$onBindViewHolder$lambda$24$$inlined$singleClick$default$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYp) > j5 || (c52794wYp instanceof Checkable)) {
                    C55296xhK.OLrzqt(c52794wYp, jCurrentTimeMillis);
                    if (!privateKeyInfo.isCopied()) {
                        privateKeyInfo.setCopied(true);
                    }
                    CopyPrivateKeyProtectFragment.Companion companion = CopyPrivateKeyProtectFragment.Companion;
                    String privateKey = privateKeyInfo.getPrivateKey();
                    String stringExtra = backupPrivateKeyActivity4.getIntent().getStringExtra(HintConstants.AUTOFILL_HINT_PASSWORD);
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    CopyPrivateKeyProtectFragment copyPrivateKeyProtectFragmentNewInstance = companion.newInstance(privateKey, stringExtra, true);
                    FragmentManager supportFragmentManager = backupPrivateKeyActivity4.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    copyPrivateKeyProtectFragmentNewInstance.show(supportFragmentManager);
                }
            }
        });
        final C52794wYp c52794wYp2 = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).tvCopy;
        final BackupPrivateKeyActivity backupPrivateKeyActivity5 = this.this$0;
        c52794wYp2.setText(C33070mpX.AYXKKw(C57407yho.Activity.fetchVPNInfo));
        Drawable drawable3 = ContextCompat.getDrawable(c52794wYp2.getContext(), C52761wXj.TaskDescription.ZxnNGp);
        if (drawable3 != null) {
            drawable3.setTint(ContextCompat.getColor(c52794wYp2.getContext(), C52761wXj.Activity.fdOvFl));
        }
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, C55298xhM.dpInt$default(16.0f, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(16.0f, (Context) null, 1, (Object) null));
        }
        c52794wYp2.setCompoundDrawablesRelative(drawable3, null, null, null);
        final long j6 = 1000;
        c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity$onCreate$2$1$onBindViewHolder$lambda$26$$inlined$singleClick$default$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYp2) > j6 || (c52794wYp2 instanceof Checkable)) {
                    C55296xhK.OLrzqt(c52794wYp2, jCurrentTimeMillis);
                    if (!privateKeyInfo.isCopied()) {
                        privateKeyInfo.setCopied(true);
                    }
                    CopyPrivateKeyProtectFragment.Companion companion = CopyPrivateKeyProtectFragment.Companion;
                    String privateKey = privateKeyInfo.getPrivateKey();
                    String stringExtra = backupPrivateKeyActivity5.getIntent().getStringExtra(HintConstants.AUTOFILL_HINT_PASSWORD);
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    CopyPrivateKeyProtectFragment copyPrivateKeyProtectFragmentNewInstance = companion.newInstance(privateKey, stringExtra, false);
                    FragmentManager supportFragmentManager = backupPrivateKeyActivity5.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    copyPrivateKeyProtectFragmentNewInstance.show(supportFragmentManager);
                }
            }
        });
        final ConstraintLayout constraintLayout = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).clContent;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity$onCreate$2$1$onBindViewHolder$$inlined$singleClick$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(constraintLayout) > j4 || (constraintLayout instanceof Checkable)) {
                    C55296xhK.OLrzqt(constraintLayout, jCurrentTimeMillis);
                    ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).ivArrow.performClick();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$20$lambda$19(final BackupPrivateKeyActivity backupPrivateKeyActivity, final C43312rms c43312rms, final ShapeableImageView shapeableImageView) {
        try {
            Result.Application application = Result.Companion;
            BitmapDrawable bitmapFromMemoryCache = backupPrivateKeyActivity.drawableCacheUtils.getBitmapFromMemoryCache(c43312rms.getLayoutPosition());
            if (bitmapFromMemoryCache != null) {
                shapeableImageView.setImageDrawable(bitmapFromMemoryCache);
                return;
            }
            ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).tvPrivateKey.setBackground(C33070mpX.KWHzl(C57407yho.ActionBar.gEmmrt));
            TextView textView = ((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).tvPrivateKey;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            final Bitmap bitmapDrawToBitmap$default = ViewKt.drawToBitmap$default(textView, null, 1, null);
            yCQ.KWHzl(((ItemBackupPrivateKeyBinding) c43312rms.OLrzqt()).getRoot().getContext()).EZpvd(20).AEQbTJ(2).EZpvd(new yCQ.TaskDescription.StateListAnimator() { // from class: com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity$onCreate$2$1$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yCQ.TaskDescription.StateListAnimator
                public final void onImageReady(BitmapDrawable bitmapDrawable) {
                    BackupPrivateKeyActivity$onCreate$2$1.onBindViewHolder$lambda$20$lambda$19$lambda$18$lambda$17(backupPrivateKeyActivity, c43312rms, shapeableImageView, bitmapDrawToBitmap$default, bitmapDrawable);
                }
            }).AEQbTJ(bitmapDrawToBitmap$default).OLrzqt(shapeableImageView);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$20$lambda$19$lambda$18$lambda$17(BackupPrivateKeyActivity backupPrivateKeyActivity, C43312rms c43312rms, ShapeableImageView shapeableImageView, Bitmap bitmap, BitmapDrawable bitmapDrawable) {
        LruCacheBitmapUtils lruCacheBitmapUtils = backupPrivateKeyActivity.drawableCacheUtils;
        int layoutPosition = c43312rms.getLayoutPosition();
        Intrinsics.copydefault(bitmapDrawable);
        lruCacheBitmapUtils.addBitmapToMemoryCache(layoutPosition, bitmapDrawable);
        shapeableImageView.setImageDrawable(bitmapDrawable);
        bitmap.recycle();
    }
}
