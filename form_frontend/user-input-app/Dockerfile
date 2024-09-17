# Step 1: Build the React app
# Use an official Node.js image as the base for building the app
FROM node:18 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy package.json and package-lock.json to the container
COPY package*.json ./

# Install the dependencies
RUN npm install

# Copy the rest of the application code to the container
COPY . .

# Build the React app for production
RUN npm run build

# Step 2: Serve the built app with Nginx
# Use an official Nginx image to serve the static files
FROM nginx:stable-alpine

# Copy the build output from the previous stage to the Nginx web directory
COPY --from=build /app/build /usr/share/nginx/html

# Expose the port that Nginx is serving on
EXPOSE 80

# Start Nginx
CMD ["nginx", "-g", "daemon off;"]
