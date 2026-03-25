package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import o.C5616Yo;
import o.C5617Yp;
import o.InterfaceC5605Yd;
import o.XR;

/* JADX INFO: loaded from: classes21.dex */
public final class SerializerFactoryConfig implements Serializable {
    private static final long serialVersionUID = 1;
    protected final InterfaceC5605Yd[] _additionalKeySerializers;
    protected final InterfaceC5605Yd[] _additionalSerializers;
    protected final XR[] _modifiers;
    protected static final InterfaceC5605Yd[] NO_SERIALIZERS = new InterfaceC5605Yd[0];
    protected static final XR[] NO_MODIFIERS = new XR[0];

    public SerializerFactoryConfig() {
        this(null, null, null);
    }

    public SerializerFactoryConfig(InterfaceC5605Yd[] interfaceC5605YdArr, InterfaceC5605Yd[] interfaceC5605YdArr2, XR[] xrArr) {
        this._additionalSerializers = interfaceC5605YdArr == null ? NO_SERIALIZERS : interfaceC5605YdArr;
        this._additionalKeySerializers = interfaceC5605YdArr2 == null ? NO_SERIALIZERS : interfaceC5605YdArr2;
        this._modifiers = xrArr == null ? NO_MODIFIERS : xrArr;
    }

    public SerializerFactoryConfig withAdditionalSerializers(InterfaceC5605Yd interfaceC5605Yd) {
        if (interfaceC5605Yd == null) {
            throw new IllegalArgumentException("Cannot pass null Serializers");
        }
        return new SerializerFactoryConfig((InterfaceC5605Yd[]) C5617Yp.KWHzl(this._additionalSerializers, interfaceC5605Yd), this._additionalKeySerializers, this._modifiers);
    }

    public SerializerFactoryConfig withAdditionalKeySerializers(InterfaceC5605Yd interfaceC5605Yd) {
        if (interfaceC5605Yd == null) {
            throw new IllegalArgumentException("Cannot pass null Serializers");
        }
        return new SerializerFactoryConfig(this._additionalSerializers, (InterfaceC5605Yd[]) C5617Yp.KWHzl(this._additionalKeySerializers, interfaceC5605Yd), this._modifiers);
    }

    public SerializerFactoryConfig withSerializerModifier(XR xr) {
        if (xr == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        return new SerializerFactoryConfig(this._additionalSerializers, this._additionalKeySerializers, (XR[]) C5617Yp.KWHzl(this._modifiers, xr));
    }

    public boolean hasSerializers() {
        return this._additionalSerializers.length > 0;
    }

    public boolean hasKeySerializers() {
        return this._additionalKeySerializers.length > 0;
    }

    public boolean hasSerializerModifiers() {
        return this._modifiers.length > 0;
    }

    public Iterable<InterfaceC5605Yd> serializers() {
        return new C5616Yo(this._additionalSerializers);
    }

    public Iterable<InterfaceC5605Yd> keySerializers() {
        return new C5616Yo(this._additionalKeySerializers);
    }

    public Iterable<XR> serializerModifiers() {
        return new C5616Yo(this._modifiers);
    }
}
