package com.example.smultronstallen

import com.google.android.gms.maps.model.LatLng
import com.google.firebase.firestore.DocumentId

data class Place(@DocumentId var documentId: String? = null, val heading: String? = null, val info: String? = null, val latLng : LatLng? = null){

}
