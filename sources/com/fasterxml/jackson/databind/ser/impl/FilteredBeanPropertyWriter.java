package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import o.InterfaceC5593Xr;
import o.VD;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public abstract class FilteredBeanPropertyWriter {
    public static BeanPropertyWriter OLrzqt(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        if (clsArr.length == 1) {
            return new SingleView(beanPropertyWriter, clsArr[0]);
        }
        return new MultiView(beanPropertyWriter, clsArr);
    }

    public static final class SingleView extends BeanPropertyWriter implements Serializable {
        private static final long serialVersionUID = 1;
        protected final BeanPropertyWriter _delegate;
        protected final Class<?> _view;

        public SingleView(BeanPropertyWriter beanPropertyWriter, Class<?> cls) {
            super(beanPropertyWriter);
            this._delegate = beanPropertyWriter;
            this._view = cls;
        }

        /* JADX DEBUG: Method merged with bridge method: rename(Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter; */
        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public SingleView rename(NameTransformer nameTransformer) {
            return new SingleView(this._delegate.rename(nameTransformer), this._view);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignSerializer(VD<Object> vd) {
            this._delegate.assignSerializer(vd);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignNullSerializer(VD<Object> vd) {
            this._delegate.assignNullSerializer(vd);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
            Class<?> activeView = vi.getActiveView();
            if (activeView == null || this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsField(obj, jsonGenerator, vi);
            } else {
                this._delegate.serializeAsOmittedField(obj, jsonGenerator, vi);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
            Class<?> activeView = vi.getActiveView();
            if (activeView == null || this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsElement(obj, jsonGenerator, vi);
            } else {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, vi);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
        public void depositSchemaProperty(InterfaceC5593Xr interfaceC5593Xr, VI vi) throws JsonMappingException {
            Class<?> activeView = vi.getActiveView();
            if (activeView == null || this._view.isAssignableFrom(activeView)) {
                super.depositSchemaProperty(interfaceC5593Xr, vi);
            }
        }
    }

    public static final class MultiView extends BeanPropertyWriter implements Serializable {
        private static final long serialVersionUID = 1;
        protected final BeanPropertyWriter _delegate;
        protected final Class<?>[] _views;

        public MultiView(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
            super(beanPropertyWriter);
            this._delegate = beanPropertyWriter;
            this._views = clsArr;
        }

        /* JADX DEBUG: Method merged with bridge method: rename(Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter; */
        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public MultiView rename(NameTransformer nameTransformer) {
            return new MultiView(this._delegate.rename(nameTransformer), this._views);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignSerializer(VD<Object> vd) {
            this._delegate.assignSerializer(vd);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignNullSerializer(VD<Object> vd) {
            this._delegate.assignNullSerializer(vd);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
            if (_inView(vi.getActiveView())) {
                this._delegate.serializeAsField(obj, jsonGenerator, vi);
            } else {
                this._delegate.serializeAsOmittedField(obj, jsonGenerator, vi);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
            if (_inView(vi.getActiveView())) {
                this._delegate.serializeAsElement(obj, jsonGenerator, vi);
            } else {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, vi);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
        public void depositSchemaProperty(InterfaceC5593Xr interfaceC5593Xr, VI vi) throws JsonMappingException {
            if (_inView(vi.getActiveView())) {
                super.depositSchemaProperty(interfaceC5593Xr, vi);
            }
        }

        private final boolean _inView(Class<?> cls) {
            if (cls == null) {
                return true;
            }
            int length = this._views.length;
            for (int i = 0; i < length; i++) {
                if (this._views[i].isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }
}
