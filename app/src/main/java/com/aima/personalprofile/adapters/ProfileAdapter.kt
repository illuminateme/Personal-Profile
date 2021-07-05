package com.aima.personalprofile.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aima.personalprofile.databinding.PprvlayoutBinding
import com.aima.personalprofile.models.Profile


class ProfileAdapter( val profiles:List<Profile>) :
    RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {

    class ProfileViewHolder(var binding: PprvlayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bind(profile: Profile){
                binding.image.setImageResource(profile.image)
                binding.fName.text= profile.fName
                binding.lName.text = profile.lName

            }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        var binding = PprvlayoutBinding.inflate(LayoutInflater.from(parent.context))
        return ProfileViewHolder(binding)
        }


    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val  profile = profiles[position]
        holder.bind(profile)
    }

    override fun getItemCount(): Int {
        return profiles.size
    }
}