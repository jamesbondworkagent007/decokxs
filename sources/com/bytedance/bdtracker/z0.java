package com.bytedance.bdtracker;

import androidx.viewpager.widget.ViewPager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class z0 implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f310a;
    public int b;
    public final int c;
    public final yHO<Float, Float, Integer, Unit> d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHO<? super java.lang.Float, ? super java.lang.Float, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(int i, @NotNull yHO<? super Float, ? super Float, ? super Integer, Unit> yho) {
        Intrinsics.EZpvd((Object) yho, "");
        this.c = i;
        this.d = yho;
        this.b = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        if (Math.abs(i2) > this.c || Math.abs(0) > this.c) {
            int i3 = this.f310a;
            this.f310a = i2 > 0 ? Math.max(i3, i2) : Math.min(i3, i2);
        }
        if (this.b == -1) {
            this.b = this.f310a;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        if (i == 0 && Math.abs(this.f310a) >= this.c) {
            yHO<Float, Float, Integer, Unit> yho = this.d;
            int i2 = this.f310a;
            yho.invoke(Float.valueOf(i2), Float.valueOf(0.0f), Integer.valueOf(i2 > this.b ? 4 : 3));
            this.f310a = 0;
            this.b = -1;
        }
    }
}
